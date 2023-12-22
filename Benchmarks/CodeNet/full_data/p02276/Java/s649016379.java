
import java.util.*;

import com.sun.glass.ui.SystemClipboard;

/**
 * A
 */
public class Main{

    void run() {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        int cnt = partition(array, 0, n-1);

        System.out.print(array[0]);

        for(int i=1; i<n; i++) {

            if( i == cnt) {
                System.out.print(" ["+array[i]+"]");
            } else {
                System.out.print(" "+array[i]);
            }

            if(i == n-1) {
                System.out.println();
            }
        }

    }

    int partition(int[] A, int p, int r) {

        int x = A[r];
        int i = p-1;
        int tmp;

        for(int j=p; j<r; j++) {
            
            if(A[j]<=x) {
                i = i+1;
                tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        }

        tmp = A[i+1];
        A[i+1] = A[r];
        A[r] = tmp;

        return i+1;
        
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
