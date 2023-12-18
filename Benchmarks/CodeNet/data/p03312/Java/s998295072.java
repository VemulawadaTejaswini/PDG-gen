import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long [] s = new long[n + 1];
        for(int i = 1;i <= n;i ++) {
            s[i] = in.nextLong();
            s[i] += s[i - 1];
        }
        int l = 1,r = 3;
        long ans = s[n];
        for(int i = 2;i < n - 1;i ++) {
            long last = s[n];
            while(l < i) {
                long d = Math.abs(s[i] - s[l] * 2);
                if(d > last) break;
                else last = d;
                l ++;
            }
            l --;
            last = s[n];
            while(r < n) {
                long d = Math.abs(s[n] + s[i] - s[r] * 2);
                if(d > last) break;
                else last = d;
                r ++;
            }
            r --;
            long max = Math.max(Math.max(Math.max(s[l], s[i] - s[l]), s[r] - s[i]), s[n] - s[r]);
            long min = Math.min(Math.min(Math.min(s[l], s[i] - s[l]), s[r] - s[i]), s[n] - s[r]);
            ans = Math.min(max - min, ans);
        }
        System.out.println(ans);
    }
}