import java.util.*;

/**
 * A
 */

// bubble sort

public class Main {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        /**
        * 1 bubbleSort(A, N) // N 個の要素を含む 0-オリジンの配列 A
        * 2   flag = 1 // 逆の隣接要素が存在する
        * 3   while flag
        * 4     flag = 0
        * 5     for j が N-1 から 1 まで
        * 6       if A[j] < A[j-1]
        * 7         A[j] と A[j-1] を交換
        * 8         flag = 1
        */

        boolean flag = true;

        while(flag) {

            flag = false;
            
            for(int j=n-1; j>0; j--) {

                if(array[j] < array[j-1]) {

                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = array[j];

                    flag = false;
                    
                }

            }

        }
    
    }
}
