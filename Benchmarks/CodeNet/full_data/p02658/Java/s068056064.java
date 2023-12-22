import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long sum = -1;
        for (int i = 0; i < n; i++) {
            long val = scanner.nextLong();
            if (val == 0) {
                System.out.println(0);
                System.exit(0);
            }
            if (sum < 0) {
                sum = val;
            } else {
                sum = sum * val;
            }
        }

        if (sum < 0) {
            System.out.println(-1);
        } else if (sum > (long) Math.pow(10, 18)) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
    }
}