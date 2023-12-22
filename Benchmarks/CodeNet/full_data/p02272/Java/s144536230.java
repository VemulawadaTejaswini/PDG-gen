import java.util.*;
import java.io.*;

class Main{
    static int[] merge(int[] A,int left,int mid,int right){
        int count = A.length;
        int[] Acopy = new int[count];
        count = left;
        int current = mid + 1;

        for(int i = left; i <= right; i++){
            Acopy[i] = A[i];
        }
        while(left <= mid && current <= right){
            if(Acopy[left] <= Acopy[current]){
                A[count] = Acopy[left];
                left++;
            }else{
                A[count] = Acopy[current];
                current++;
            }
            count++;
        }

        for(int i = 0; i <= (mid - left); i++){
            A[count + i] = Acopy[left + i];
        }
        return A;

        // int n1 = mid - left + 1;
        // int n2 = right - mid + 1;
        // int[] L = new int[n1];
        // int[] R = new int[n2];
        // int i, j, k, count;

        // System.out.println("left is " + left);
        // System.out.println("right is " + right);
        // System.out.println("mid is " + mid);

        // for(i = 0; i < A.length; i++){
        //     System.out.print(A[i] + " ");
        // }
        // System.out.println();

        // for(i = 0; i < n1 - 1; i++){
        //     L[i] = A[left + i];
        //     System.out.print(L[i] + " ");
        // }

        // System.out.println();

        // for(i = 0; i < n2 - 1; i++){
        //     R[i] = A[mid + i];
        //     System.out.print(R[i] + " ");
        // }

        // System.out.println();

        // L[n1 - 1] = Integer.MAX_VALUE;
        // R[n2 - 1] = Integer.MAX_VALUE;

        // i = 0;
        // j = 0;

        // for(k = left; k < right - 1; k++){
        //     if(L[i] <= R[j]){
        //         A[k] = L[i];
        //         i = i + 1;
        //     }else{
        //         A[k] = R[j];
        //         j = j + 1;
        //     }
        // }

        // //
        // for(i = 0; i < A.length; i++){
        //     System.out.print(A[i] + " ");
        // }
        // System.out.println();
        // //
        // // count = k;

        // // for(k = 0; k < n1; k++){
        // //     A[count + i] = A[left];
        // // }

        // System.out.println("----------OK");
        // return A;
    }

    static int[] mergeSort(int[] A,int left,int right, int count){
        int[] sortArray = new int[count];

        // System.out.println("--left is " + left);
        // System.out.println("--right is " + right);

        if(left < right){
            int mid  = (left + right) / 2;
            mergeSort(A, left, mid, count);
            mergeSort(A, mid + 1, right, count);
            sortArray = merge(A, left, mid, right);
        }
        return sortArray;
    }

    public static void main(String[] args){
        int count1;
        int[] array1;
        int count;

        try{
            Scanner scan = new Scanner(System.in);
            String str;

            str= scan.next();
            count1 = Integer.parseInt(str);
            array1 = new int[count1];

            for(int i = 0; i < array1.length; i++){
                str = scan.next();
                array1[i] = Integer.parseInt(str);
            }
            // System.out.println("OK1");
            array1 = mergeSort(array1, 0, count1 - 1, count1);
            // System.out.println("OKlast");
            for(int i = 0; i < array1.length; i++){
                if(i == array1.length - 1){
                    System.out.println(array1[i]);
                }else{
                    System.out.print(array1[i] + " ");
                }
            }

        }catch(Exception e){
            System.out.println("ERROR " + e);
        }

    }
}
