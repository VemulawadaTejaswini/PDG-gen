import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];
        f[n - 1] = 1;
        for (int i = 0; i < n - 1; i++) {
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int sum = s[i] + c[i];
            for (int j = i + 1; j < n; j++) {
                if (sum > s[j]) {
                    sum += sum % f[j] + c[j];
                } else {
                    sum = s[j] + c[j];
                }
                ans[i] = sum;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
