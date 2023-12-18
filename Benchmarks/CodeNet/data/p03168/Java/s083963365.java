import java.util.*;

class DPValue {
    public DPValue(int heads, int tails, double val) {
        this.heads = heads;
        this.tails = tails;
        this.val = val;
    }

    public DPValue(DPValue dp) {
        this.heads = dp.heads;
        this.tails = dp.tails;
        this.val = dp.val;
    }

    public DPValue() {
    }

    int heads, tails;
    double val;


    @Override
    public String toString() {
        return "heads: " + heads + " tails: " + tails + " val: " + val;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<DPValue>[] dp = new ArrayList[n + 2];
        for(int i = 0; i < n + 2; i++) {
            dp[i] = new ArrayList<>();
        }
        double []a = new double[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextDouble();
        }

        DPValue start = new DPValue();
        start.heads = 0; start.tails = 0;
        start.val = 1;
        dp[0].add(start);
        for(int i = 0; i < n; i++) {
            for(DPValue x: dp[i]) {
                DPValue newdp = new DPValue(x);
                // tails
                newdp.val *= (1 - a[i]);
                newdp.tails += 1;
                dp[i + 1].add(newdp);

                newdp = new DPValue(x);
                // heads
                newdp.val *= a[i];
                newdp.heads += 1;
                dp[i + 1].add(newdp);
            }
        }
//        for(var v : dp) {
//            System.out.println(v);
//        }
        double ans = 0;
        for(DPValue x : dp[n]) {
            if(x.heads > x.tails) {
                ans += x.val;
            }
        }
        System.out.println(ans);
    }
}
