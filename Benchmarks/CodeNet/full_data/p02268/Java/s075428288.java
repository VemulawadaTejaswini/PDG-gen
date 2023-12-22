import java.util.*;

public class Main {
    static int binarySearch(int n, int A[], int key) {
        int left = 0;
        int right = n;
        while(left < right) {
            int mid = (left + right) / 2;
            if(A[mid] == key) return 1;
            else if(key < A[mid]) right = mid;
            else left = mid + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] A;
        A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int key = sc.nextInt();
            count += binarySearch(n, A, key);
        }
        System.out.println(count);
    }    
}
