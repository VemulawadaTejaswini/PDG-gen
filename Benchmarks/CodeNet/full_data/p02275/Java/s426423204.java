import java.util.*;
import java.io.*;

class Main{
    static int[] CountingSort(int[] A){
        int[] B = new int[A.length + 1];
        int[] C = new int[10000];

        for(int i = 0; i < C.length; i++){
            C[i] = 0;
        }

        for(int j = 0; j < A.length; j++){
            C[A[j]]++;
        }

        // System.out.println("----------------------------------");

        for(int i = 1; i < A.length; i++){
            C[i] = C[i] + C[i - 1];
            // System.out.print((i - 1) + " ");
        }

        // System.out.println(A.length - 1);

        // for(int i = 0; i < A.length; i++){
        //     System.out.print(C[i] + " ");
        // }

        // System.out.println();
        // System.out.println("----------------------------------");
        // System.out.println(A.length);
        // System.out.println(A[A.length - 1]);
        // System.out.println(B[(C[A[A.length - 1]] - 1)]);

        for(int j = A.length - 1; j >= 0; j--){
            B[C[A[j]]] = A[j];
            C[A[j]]--;
            // if(j == 1){
            //     B[C[A[j - 1]]] = A[0];
            // }
        }

        // for(int i = 0; i < A.length; i++){
        //     // System.out.print(B[i] + " ");
        //     B[i] = B[i + 1];
        // }
        // System.out.println();
        return B;
    }

    public static void main(String[] args){
        int count;
        int[] array;

        try{
            Scanner scan = new Scanner(System.in);
            String str;

            str= scan.next();
            count = Integer.parseInt(str);
            array = new int[count];

            for(int i = 0; i < array.length; i++){
                str = scan.next();
                array[i] = Integer.parseInt(str);
            }

            array = CountingSort(array);

            for(int i = 1; i < array.length; i++){
                if(i == array.length - 1){
                    System.out.println(array[i]);
                }else{
                    System.out.print(array[i] + " ");
                }
            }

        }catch(Exception e){
            System.out.println("ERROR " + e);
        }

    }
}

