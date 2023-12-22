import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = input.nextInt();
        }

        buildMaxHeap(A);
        //System.out.println(Arrays.toString(A));
        for(int i = 0; i < A.length; i++){
            System.out.print(" " + A[i]);
        }
        System.out.println();
    }

    static void maxHeapify(int[] A,int i){
        int l = 2*i+1;
        int r = 2*i+2;
        int largest = 0;
        if(l < A.length && A[l] > A[i]){
            largest = l;
        }else {
            largest = i;
        }

        if(r < A.length && A[r] > A[largest]){
            largest = r;
        }

        if(largest != i){
            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;
            maxHeapify(A,largest);
        }
    }
    static void buildMaxHeap(int[] A){
        for(int i = A.length / 2; i >= 0; i--){
            maxHeapify(A,i);
        }
    }
}
