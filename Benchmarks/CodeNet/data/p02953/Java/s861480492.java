import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println(solve(n, h));
    }

    public static String solve(int n, int[] h) {
        for (int i = 0; i < n; i++) {
            int hi = h[i];
            for (int j = i + 1; j < n; j++) {
                int hj = h[j];
                if (hj <= hi - 2) {
                    return "No";
                }
            }
        }
        return "Yes";
    }
}