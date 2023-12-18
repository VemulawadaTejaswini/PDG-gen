import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(-1);
        queue.add(-sum);
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                queue.add(-i);
                if (i * i != sum) {
                    queue.add(-sum / i);
                }
            }
        }
        while (queue.size() > 0) {
            int x = - queue.poll();
            int[] mods = new int[n];
            for (int i = 0; i < n; i++) {
                mods[i] = arr[i] % x;
            }
            Arrays.sort(mods);
            if (mods[n - 1] == 0) {
                System.out.println(x);
                return;
            }
            long[] sums = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                sums[i] = sums[i - 1] + mods[i - 1];
            }
            int tmp = 0;
            for (int i = n; i > 0; i--) {
                tmp += x - mods[i - 1];
                if (tmp > k) {
                    break;
                }
                if (tmp == sums[i - 1]) {
                    System.out.println(x);
                    return;
                } 
            }
        }
    }
}