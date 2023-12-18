import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i=0;i <n;i++){
            A[i]=sc.nextInt();
        }
        sc.close();

        A = Arrays.sort(A);

        int[] B = new int[n];
        
        for(int i=1;i<n;i++){
            B[i]=A[i]-A[i+1];
        }
        B[n-1] = A[n-1]-k+A[0];

        B = sort(B);
        // for(int i = 0 ;i<B.length;i++){
        //     System.out.println(B[i]);
        // }
        k=k-B[0];
        System.out.print(k);
        
        // int[] A = {8,7,456,54,7,42,47,5};
        // A = sort(A);
        // for(int i=0;i<A.length;i++){
        //     System.out.println(A[i]);
        // }
    }
}