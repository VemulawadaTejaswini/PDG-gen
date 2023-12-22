import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static final long MAX = 1000000000000000000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 1;

        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextLong();
        }

        Arrays.sort(num);

        int count = 0;
        for (int i = 0; i < n; i++) {
            ans *= num[i];

            if (ans > MAX) {
                count++;
            } else if (ans < 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}