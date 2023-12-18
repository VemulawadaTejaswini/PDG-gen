import java.util.*;

public class Main {
    static int modP = 1000000007;
    static int inf  = 1<<29;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n    = in.nextInt();
        int[] dp = new int[100001];
        Arrays.fill(dp, inf);
        dp[0] = 0;
        Queue<Integer> q = new PriorityQueue<>();
        q.add(1);
        for(int i = 6; i < 1000000; i *= 6) q.add(i);
        for(int i = 9; i < 1000000; i *= 9) q.add(i);

        Object[] a = q.toArray();
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < a.length; j++) {
                int aj = (int)a[j];
                if(i - aj >= 0) {
                    dp[i] = Math.min(dp[i], dp[i-aj] + 1);
                }
            }
        }

        print(dp[n]);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }
}

class E {
    int l, r, w;
    E(int l, int r, int w) {
        this.l = l;
        this.r = r;
        this.w = w;
    }
}
