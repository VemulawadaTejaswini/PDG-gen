import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, K;
        int[] v;
        N = in.nextInt();
        K = in.nextInt();
        v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = in.nextInt();
        }

        long ans = Long.MIN_VALUE;
        int ops;
        ops = Math.min(N, K);
        for (int left = 0; left < ops; left++) {
            for (int right = 0; left + right < ops; right++) {
                ans = Math.max(ans, getJewel(left, right, v, ops));
            }
        }
        System.out.println(ans);
        in.close();
    }

    //左からleft, 右からright個とる
    static long getJewel(int left, int right, int[] v, int ops) {
        long ret = 0;
        PriorityQueue<Integer> minValues = new PriorityQueue<>();
        for (int i = 0; i < left; i++) {
            minValues.add(v[i]);
        }
        for (int i = 0; i < right; i++) {
            minValues.add(v[v.length - 1 - i]);
        }
        int M = ops - left - right;
        for (int i = 0; i < M; i++) {
            if (!minValues.isEmpty() && minValues.peek() < 0) {
                minValues.poll();
            }
        }
        while (!minValues.isEmpty()) {
            ret += minValues.poll();
        }
        return ret;
    }

}
