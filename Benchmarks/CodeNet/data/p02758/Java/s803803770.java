import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        final int INF_NUM = (int) 1e8;
        final long MOD = 998244353;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Robot> robots = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            int move = sc.nextInt();
            robots.add(new Robot(pos, move));
        }
        Collections.sort(robots);

        int[] remove = new int[n];
        for (int i = 0; i < n; i++) {
            remove[i] = getRunRobotMinimumNumber(robots, i);
        }
        SegmentTreeInt removes = new SegmentTreeInt(remove, Math::min, INF_NUM);
        for(int i = 0 ; i < n ; i++){
            removes.set(i, removes.getValueInRange(remove[i], i+1));
        }

        long[] dp = new long[n+1];
        dp[0] = 1;
        for(int i = 1 ; i <= n ; i++){
            dp[i] = (dp[i-1] + dp[removes.getValueInRange(remove[i-1], i)]) % MOD;
        }

        System.out.println(dp[n]);
    }

    static int lg(int tar) {
        int ans = 0;
        for (int m = tar; m > 0; m >>= 1) {
            ans++;
        }
        return ans;
    }

    static int getRunRobotMinimumNumber(ArrayList<Robot> robots, int num) {
        int reached = robots.get(num).reach();
        //にぶたんする
        int ok = num + 1;
        int ng = -1;
        while (ok - ng > 1) {
            int mid = ok + (ng - ok) / 2;
            if (robots.get(mid).pos < reached) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
}


/*
    int配列データからSeg木を作る
    SegmentTreeInt(int[] data, IntBinaryOperator monoid, int INF)
    で生成し，
    set(int index, int data)
    で更新
    getValueInRange(int left, int right)
    で[left, right)を取得
 */

class SegmentTreeInt {
    final int INF;
    final int size;
    final int depth;
    final int nodeNum;
    final IntBinaryOperator monoid;
    int[] node;

    SegmentTreeInt(int[] data, IntBinaryOperator monoid, int INF) {
        this.INF = INF;
        size = data.length;
        depth = lg(size-1)+1;
        nodeNum = (1 << depth) - 1;
        node = new int[nodeNum];
        this.monoid = monoid;

        for (int i = 0; i < (nodeNum >> 1); i++) {
            node[i] = INF;
        }
        for (int i = 0; i < size; i++) {
            node[getIndex(i)] = data[i];
        }
        for (int i = (nodeNum >> 1) + size; i < nodeNum; i++) {
            node[i] = INF;
        }

        for (int i = (nodeNum >> 1) - 1; i >= 0; i--) {
            node[i] = monoid.applyAsInt(node[(i << 1) + 1], node[(i << 1) + 2]);
        }
    }

    //index番目のデータをdataに変更し、Seg木を更新する
    void set(int index, int data) {
        if (index < 0 || index >= size) {
            return;
        }
        index = getIndex(index);
        node[index] = data;
        while (index >= 0) {
            index = update(index);
        }
    }

    //[left, right)のSeg木の値を取得する
    int getValueInRange(int left, int right) {
        int ans = INF;
        int time = depth - 1;

        while (left < right) {
            if ((left & 1) == 1) {
                ans = monoid.applyAsInt(ans, node[getIndex(left, time)]);
                left++;
            }
            left >>= 1;
            if ((right & 1) == 1) {
                right--;
                ans = monoid.applyAsInt(ans, node[getIndex(right, time)]);
            }
            right >>= 1;

            time--;
        }

        return ans;
    }

    //指定したノードの親ノードを更新し、そのノード番号を返す
    private int update(int tar) {
        if (tar == 0) {
            return -1;
        }
        int parent = ((tar + 1) >> 1) - 1;
        node[parent] = monoid.applyAsInt(node[(parent << 1) + 1], node[(parent << 1) + 2]);
        return parent;
    }

    private int getIndex(int index) {
        return index + (nodeNum >> 1);
    }

    private int getIndex(int index, int depth) {
        return index + (nodeNum >> (this.depth - depth));
    }

    static int lg(int tar) {
        int ans = 0;
        for (; tar > 0; tar >>= 1) {
            ans++;
        }
        return ans;
    }

    public String toString() {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < nodeNum; i++) {
            strb.append("" + node[i] + ",");
        }
        return strb.toString();
    }
}


class Robot implements Comparable<Robot> {
    int pos;
    int move;

    Robot(int pos, int move) {
        this.pos = pos;
        this.move = move;
    }

    int reach() {
        return (pos + move);
    }

    public int compareTo(Robot tar) {
        return (tar.pos - pos);
    }

    public String toString() {
        return ("pos:" + pos + ", move:" + move);
    }
}
