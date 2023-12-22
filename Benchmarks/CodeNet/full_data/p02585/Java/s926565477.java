import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        int[] p = new int[n+1];
        long[] c = new long[n+1];
        for(int i=1; i<=n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        for(int i=1; i<=n; i++) {
            c[i] = Long.parseLong(sc.next());
        }
        
        long ans = -1000000001;
        long max = -1000000001;
        long count = 0;
        for(int i=1; i<=n; i++) {
            int now = p[i];
            count = c[now];
            max = count;
            long roop = 1;
            while(now != i && k >= roop) {
                now = p[now];
                count += c[now];
                if(max < count) max = count;
                roop++;
            }
            if(k > roop) {
                if(count < 0) {
                    if(ans < max) ans = max;
                    continue;
                }else {
                    count = count * (k / roop - 1);
                    roop = roop * (k / roop - 1);
                    if(max < count) max = count;
                    while(roop < k) {
                        now = p[now];
                        count += c[now];
                        if(max < count) max = count;
                        roop++;
                    }
                    if(ans < max) ans = max;
                    continue;
                }
            }else {
                if(ans < max) ans = max;
            }
            
        }
        System.out.println(ans);
    }
}