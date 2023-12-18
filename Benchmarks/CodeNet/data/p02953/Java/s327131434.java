import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        if (helper(A)) System.out.println("Yes");
        else System.out.println("No");
    }

    static boolean helper(int[] A) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                if (A[i] - A[i + 1] > 1) return false;
                count++;
                if (count >= 2) return false;
            }
        }
        return true;
    }
}