import java.util.*;

/**
 * A
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        for(int i=1; i<n-1; i++) {
            
            int key = array[i];
            /* insert A[i] into the sorted sequence A[0,...,j-1] */
            int j = i-1;
            while(j>=0 && array[j]>key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;

            for(int num : array) {
                System.out.print(num+" ");
            }
            System.err.println();

        }

    }
}
