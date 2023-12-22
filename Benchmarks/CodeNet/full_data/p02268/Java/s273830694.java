import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int C = 0;
        for (int i = 0; i < q; i++) {
            int T = sc.nextInt();
            boolean answer = binarySearch(S, n, T);
            if (answer) C++;
        }
        System.out.println(C);
        sc.close();
    }
    public static boolean binarySearch(int[] S, int n, int T) {
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (S[mid] == T) return true;
            else if (T < S[mid]) right = mid;
            else left = mid + 1;
        }
        return false;
    }
}
