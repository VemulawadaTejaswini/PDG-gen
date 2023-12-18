import java.util.*;
//TLE
public class Main {
    static int N, K;
    static int[] v;

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = in.nextInt();
            deque.addLast(i);
        }
        int k = 0, sum = 0;
        List<Integer> ownedJewels = new ArrayList<>();
        int ans = solve(k, sum, deque, ownedJewels);
        System.out.println(ans);
        in.close();
    }

    //時刻k(1~K)から得られる利益の最大値を求める
    public static int solve(int k, int sum,
                            Deque<Integer> que, List<Integer> jewels) {
        if (k == K) {
            return sum;
        }

        //操作A: pollFirst
        //操作B: pollLast
        //操作C: addFirst
        //操作D: addLast
        int ret = sum;
        //A
        if (que.size() > 0) {
            Deque<Integer> nextQue = new ArrayDeque<>(que);
            List<Integer> nextJewels = new ArrayList<>(jewels);
            int vindex = nextQue.pollFirst();
            nextJewels.add(vindex);
            int nextSum = sum + v[vindex];
            ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels));

            //B
            nextQue = new ArrayDeque<>(que);
            nextJewels = new ArrayList<>(jewels);
            vindex = nextQue.pollLast();
            nextJewels.add(vindex);
            nextSum = sum + v[vindex];
            ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels));
        }

        if (jewels.size() > 0) {
            //C
            for (int i = 0; i < jewels.size(); ++i) {
                Deque<Integer> nextQue = new ArrayDeque<>(que);
                List<Integer> nextJewels = new ArrayList<>(jewels);
                int vindex = jewels.get(i);
                nextQue.addFirst(vindex);
                nextJewels.remove(i);
                int nextSum = sum - v[vindex];
                ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels));
            }

            //D
            for (int i = 0; i < jewels.size(); ++i) {
                Deque<Integer> nextQue = new ArrayDeque<>(que);
                List<Integer> nextJewels = new ArrayList<>(jewels);
                int vindex = jewels.get(i);
                nextQue.addLast(vindex);
                nextJewels.remove(i);
                int nextSum = sum - v[vindex];
                ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels));
            }
        }
        return ret;
    }
}
