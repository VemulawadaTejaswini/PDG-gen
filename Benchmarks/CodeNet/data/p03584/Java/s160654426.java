import java.util.*;

public class Main {
    private class Sina {
        long num;
        long value;

        public Sina(long n, long v) {
            num = n;
            value = v;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        Sina sina[] = new Sina[n];
        for (int i = 0; i < n; i++) {
            sina[i] = new Sina(sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(sina, (o1, o2) -> Long.compare(o1.num, o2.num));

        long ans = 0;
        for (int i = 0; i <= 30; i++) {
            if (i > 0 && (k >> (i - 1)) % 2 == 0) {
                continue;
            }

            long kr = (i == 0) ? k : ((k >> i) << i) + ((1 << (i - 1)) - 1);
            long sum = 0;
            for (int j = 0; j < n; j++) {
                if ((kr & sina[j].num) != sina[j].num) {
                    continue;
                }

                sum += sina[j].value;
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
