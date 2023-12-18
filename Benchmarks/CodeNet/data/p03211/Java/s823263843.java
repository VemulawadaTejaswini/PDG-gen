import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;
    long MOD = 1000000007;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int c = 0;
        int ans = INF;
        for(int i = 0; i < S.length()-2;i++){
            String s = S.substring(i,i+3);
            int o = Integer.parseInt(s);
            if(Math.abs(o-753) <= ans){
                ans = Math.abs(o-753);
            }
        }
        System.out.println(ans);
    }
}
