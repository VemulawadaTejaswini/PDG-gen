import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n+1];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            a[i] %= m;
            a[i+1] = (a[i]+a[i+1])%m;
        }
        
        HashMap<Integer, Long> h = new HashMap<>();
        long ans = 0L;
        for(int i=0; i<=n; i++){
            long tmp = h.getOrDefault(a[i], 0L);
            ans += tmp;
            h.put(a[i], tmp+1);
        }
        
        System.out.println(ans);
    }
}
