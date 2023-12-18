import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Long> queue = new PriorityQueue<>();
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] list = new long[N];
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            list[i] = num;
        }
        Arrays.sort(list);
        long l = -1000000000000000001L;
        long r = 1000000000000000001L;
        while (l + 1 < r) {
            long m = (l + r) / 2;
            if (isUnderK(list, m, K)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }
    
    // under num 
    private static boolean isUnderK(long[] list, long num, long k) {
        long count = 0;
        for (int i = 0; i < list.length; i++) {
            int l = -1, r = list.length;
            if (list[i] < 0) {
                while (l + 1 < r) {
                    int m = (l + r) / 2;
                    if (list[m] * list[i] < num) {
                        r = m;
                    } else {
                        l = m;
                    }
                }
                count += (list.length - r);
            } else {
                while (l + 1 < r) {
                    int m = (l + r) / 2;
                    if (list[m] * list[i] < num) {
                        l = m;
                    } else {
                        r = m;
                    }
                }
                count += r;
            }
            if (list[i] * list[i] < num)
                count--;
        }
        count /= 2;
        return count < k;
    }
}
