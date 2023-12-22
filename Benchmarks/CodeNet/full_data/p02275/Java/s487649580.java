

import java.util.*;

/**
 * A
 */
public class Main {

    void run() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        int max=0;

        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
            if(A[i]>max) {
                max = A[i];
            }
        }

        sc.close();

        countingSort(A, B, max);

        /*
        for(int i=1; i<n; i++) {
            if(i == n-1) {
                System.out.println(" "+B[i]);
            } else {
                System.out.print(" "+B[i]);
            }
        }
        */

        StringBuilder br = new StringBuilder();

        for(int i=0; i<n-1; i++) {
            br.append(B[i]+" ");
        }
        System.out.println(br.append(B[n-1]));

    }

    void countingSort(int[] A, int[] B, int k) {

        int[] C = new int[k+1];

        for(int j=0; j<A.length; j++) {
            C[A[j]]++;
        }

        for(int i=1; i<k+1; i++) {
            C[i] = C[i] + C[i-1];
        }

        for(int j=A.length-1; j>=0; j--) {

            B[C[A[j]]-1] = A[j];
            C[A[j]]--;

        }

    } 

    public static void main(String[] args) {
        new Main().run();
    }
}

