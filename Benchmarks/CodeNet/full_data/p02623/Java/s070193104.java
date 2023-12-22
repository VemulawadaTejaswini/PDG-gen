import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long k = scanner.nextLong();

        List<Long> alist = new ArrayList<>();
        List<Long> asum = new ArrayList<>();
        List<Long> blist = new ArrayList<>();
        List<Long> bsum = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            alist.add(a);
            if (i > 0) {
                asum.add(asum.get(i - 1) + a);
            } else {
                asum.add(a);
            }
        }

        long max = 0;
        for (int i = 0; i < m; i++) {
            long b = scanner.nextLong();
            blist.add(b);
            long bmax = 0;
            if (i > 0) {
                bmax = bsum.get(i - 1) + b;
                bsum.add(bsum.get(i - 1) + b);
            } else {
                bmax = b;
                bsum.add(b);
            }

            for (int j = 0; j < asum.size(); j++) {
                long combined = asum.get(j) + bmax;
                if (combined <= k) {
                    long sum = (i + 1) + (j + 1);
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);

    }

}