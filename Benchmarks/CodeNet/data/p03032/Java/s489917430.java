import javax.lang.model.type.IntersectionType;
import java.util.*;

class Pair implements Comparable<Pair> {
    int index, value;

    public Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Pair o) {
        return this.value - o.value;
    }
}

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
        PriorityQueue<Pair> ownedJewels = new PriorityQueue<>();
        int ans = solve(k, sum, deque, ownedJewels,
                false, false, false, false);
        System.out.println(ans);
        in.close();
    }

    //時刻k(1~K)から得られる利益の最大値を求める
    public static int solve(int k, int sum,
                            Deque<Integer> que, PriorityQueue<Pair> jewels,
                            boolean isDoneA, boolean isDoneB, boolean isDoneC, boolean isDoneD) {
        if (k == K) {
            return sum;
        }

        Deque<Integer> nextQue;
        PriorityQueue<Pair> nextJewels;
        //操作A: pollFirst
        //操作B: pollLast
        //操作C: addFirst
        //操作D: addLast
        int ret = sum;
        //A
        if (que.size() > 0 && !isDoneC) {
            nextQue = new ArrayDeque<>(que);
            nextJewels = new PriorityQueue<>();
            nextJewels.addAll(jewels);
            int vindex = nextQue.pollFirst();
            nextJewels.add(new Pair(vindex, v[vindex]));
            int nextSum = sum + v[vindex];
            isDoneA = true;
            ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels,
                    isDoneA, isDoneB, isDoneC, isDoneD));
        }

        //B
        if (que.size() > 0 && !isDoneD) {
            nextQue = new ArrayDeque<>(que);
            nextJewels = new PriorityQueue<>();
            nextJewels.addAll(jewels);
            int vindex = nextQue.pollLast();
            nextJewels.add(new Pair(vindex, v[vindex]));
            int nextSum = sum + v[vindex];
            isDoneB = true;
            ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels,
                    isDoneA, isDoneB, isDoneC, isDoneD));
        }

        //C
        if (jewels.size() > 0 && jewels.peek().value <= 0) {
            nextQue = new ArrayDeque<>(que);
            nextJewels = new PriorityQueue<>();
            nextJewels.addAll(jewels);
            Pair jewel = nextJewels.poll();
            nextQue.addFirst(jewel.index);
            int nextSum = sum - jewel.value;
            isDoneC = true;
            ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels,
                    isDoneA, isDoneB, isDoneC, isDoneD));
        }

        //C
        if (jewels.size() > 0 && jewels.peek().value <= 0) {
            nextQue = new ArrayDeque<>(que);
            nextJewels = new PriorityQueue<>();
            nextJewels.addAll(jewels);
            Pair jewel = nextJewels.poll();
            nextQue.addLast(jewel.index);
            int nextSum = sum - jewel.value;
            isDoneC = true;
            ret = Math.max(ret, solve(k + 1, nextSum, nextQue, nextJewels,
                    isDoneA, isDoneB, isDoneC, isDoneD));
        }
        return ret;
    }
}
