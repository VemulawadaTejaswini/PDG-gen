import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt()-1;
        }

        Map<Integer, Long> visited = new HashMap<>();
        int cur = 0;
        visited.put(cur, 0l);
        long tmp = k;
        long count = 0;
        boolean canSkip = true;
        while (tmp >= 0) {
            //System.out.println("tmp, cur = " + tmp + "," + cur );
            int next = a[cur];
            Long past = visited.get(next);
            if (canSkip && past != null) {
                long loop = count - past + 1;
                //System.out.println("loop=" +loop);

                tmp %= loop;
                if (tmp == 0) {
                    break;
                }
                canSkip = false;
            }

            count++;
            visited.put(next, count);
            cur = next;
            tmp--;
        }
        System.out.println(cur + 1);
    }
}