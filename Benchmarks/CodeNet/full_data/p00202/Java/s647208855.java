import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean[] prime = new boolean[MAX + 1];
        Arrays.fill(prime, true);
        prime[1] = false;
        for (int i = 2; i <= 1000; i++) {
            if (prime[i]) {
                for (int j = i * 2; j < MAX + 1; j += i) {
                    prime[j] = false;
                }
            }
        }
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if ((n | x) == 0) {
                break;
            }
            int[] m = new int[n];
            for (int i = 0; i < n; i++)
                m[i] = sc.nextInt();
            boolean[] b = new boolean[x + 1];
            b[0] = true;
            String ans = "NA";
            for (int i = 1; i <= x; i++) {
                for (int j = 0; j < n; j++) {
                    if (i - m[j] >= 0 && b[i - m[j]]) {
                        b[i] = true;
                        if (prime[i])
                            ans = i + "";
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}