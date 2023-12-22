import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long k = scanner.nextLong();

        List<Long> asum = new ArrayList<>();
        List<Long> bsum = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();

            if (a > k) {
                continue;
            }

            if (i > 0) {
                asum.add(asum.get(i - 1) + a);
            } else {
                asum.add(a);
            }
        }

        long max = 0;
        for (int i = 0; i < m; i++) {
            long b = scanner.nextLong();
            if (b > k) {
                continue;
            }
            long bmax = 0;
            if (i == 0) {
                bmax = b;
                bsum.add(b);
            } else {
                bmax = bsum.get(i - 1) + b;
                bsum.add(bsum.get(i - 1) + b);
            }

            for (int j = asum.size() - 1; j >= 0; j--) {
                long sum = (i + 1) + (j + 1);
                if (max > sum) {
                    break;
                }
                long combined = asum.get(j) + bmax;
                if (combined <= k) {
                    if (max < sum) {
                        max = sum;
                    }
                    break;
                }
            }
        }
        System.out.println(max);

    }

}