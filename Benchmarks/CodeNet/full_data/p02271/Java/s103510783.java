import java.util.Scanner;

public class Main {

    private static boolean search(int A[], int m) {
        for (int j = 0; j < A.length - 1; j++) {
            for (int k = j + 1; k < A.length; k++) {
                if (A[j] + A[k] == m) return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, A[], q, m;
        n = sc.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            m = sc.nextInt();
            if (search(A, m)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}