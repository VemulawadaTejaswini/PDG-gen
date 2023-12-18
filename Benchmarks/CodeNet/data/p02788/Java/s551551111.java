import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        
        long[] xh = new long[n];
        for(int i=0; i<n; i++){
            long x = Integer.parseInt(sc.next());
            long h = Integer.parseInt(sc.next());
            xh[i] = (x<<32) + h;
        }
        Arrays.sort(xh);
        
        PriorityQueue<Long> q = new PriorityQueue<>();
        q.add(((long)1e9+7)<<32);
        long ans = 0;
        long exp = 0;
        for(int i=0; i<n; i++){
            int x = (int)(xh[i]>>32);
            int h = (int)xh[i];
            
            long peek = q.peek();
            while((peek>>32)<x){
                exp -= (int)peek;
                q.poll();
                peek = q.peek();
            }
            
            long add = (h+a-1)/a - exp;
            add = Math.max(0, add);
            ans += add;
            
            exp += add;
            q.add(((x+d*2L)<<32)+add);
        }
        System.out.println(ans);
    }
}
