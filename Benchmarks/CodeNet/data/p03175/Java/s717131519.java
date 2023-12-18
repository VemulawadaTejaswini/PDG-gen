import java.util.*;

public class Main {
    static int N;
    static ArrayList<Node> list;
    static long[][] dp;
    static int mod = 1_000_000_007;

    public static class Node {
        public ArrayList<Integer> neighbor;
        public int parent;
        public ArrayList<Integer> children;

        public Node() {
            this.neighbor = new ArrayList<Integer>();
            this.parent = -2;
            this.children = new ArrayList<Integer>();
        }
    }

    static void dfs(int from) {
        for (Integer to : list.get(from).neighbor) {
            if (list.get(to).parent!=-2) continue;
            list.get(from).children.add(to);
            list.get(to).parent = from;
            dfs(to);
        }
    }

    static long[] dfs_dp(int from) {
        long[] tmp = new long[2]; // tmp[0]->white tmp[1]->black
        tmp[0] = 1;
        tmp[1] = 1;
        if (dp[from][0]!=-1 && dp[from][1]!=-1) {
            tmp[0] = dp[from][0];
            tmp[1] = dp[from][1];
            return tmp;
        } else {
            for (Integer child : list.get(from).children) {
                long[] add = dfs_dp(child);
                tmp[0] = (tmp[0]*(add[0]+add[1])%mod)%mod;
                tmp[1] = (tmp[1]*add[0])%mod;
            }
            dp[from][0] = tmp[0];
            dp[from][1] = tmp[1];
            return tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        list = new ArrayList<Node>();
        for (int i=0;i<N;i++) {
            Node add = new Node();
            list.add(add);
        }
        for (int i=0;i<N-1;i++) {
            int x = Integer.parseInt(sc.next())-1;
            int y = Integer.parseInt(sc.next())-1;
            list.get(x).neighbor.add(y);
            list.get(y).neighbor.add(x);
        }

        list.get(0).parent = -1;
        dfs(0);

        dp = new long[N][2];
        for (int i=0;i<N;i++) {
            for (int j=0;j<2;j++) {
                dp[i][j] = -1;
            }
        }
        dfs_dp(0);
        System.out.println((dp[0][0]+dp[0][1])%mod);
    }
}