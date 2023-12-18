import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long W = sc.nextLong();
        long w1 = 0;

        ArrayList<Long>[] items = new ArrayList[4];

        for (int i = 0; i < 4; i++) {
            items[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            long w = sc.nextLong();
            long v = sc.nextLong();

            if (i == 0) {
                w1 = w;
                items[0].add(v);
            } else {
                items[(int) (w - w1)].add(v);
                // System.out.println("DEBUG:addV:" + items[(int) (w - w1)]);
            }
        }

        for (int i = 0; i < 4; i++) {
            Collections.sort(items[i]);

            for (int j = 1; j < items[i].size(); j++) {
                items[i].set(j, items[i].get(j - 1) + items[i].get(j));
            }
        }

        final int s0 = items[0].size();
        final int s1 = items[1].size();
        final int s2 = items[2].size();
        final int s3 = items[3].size();
        long max = 0;

        for (int i = -1; i < items[0].size(); i++) {
            for (int j = -1; j < items[1].size(); j++) {
                for (int k = -1; k < items[2].size(); k++) {
                    for (int l = -1; l < items[3].size(); l++) {
                        if (w1 * (i + 1) + (w1 + 1) * (j + 1) + (w1 + 2) * (k + 1) + (w1 + 3) * (l + 1) <= W) {
                            long a = (i == -1) ? 0 : items[0].get(i);
                            long b = (j == -1) ? 0 : items[1].get(j);
                            long c = (k == -1) ? 0 : items[2].get(k);
                            long d = (l == -1) ? 0 : items[3].get(l);
                            max = Math.max(max, a + b + c + d);
                        }
                    }
                }
            }
        }

        System.out.println(max);

    }

}
