import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
        
        long ans = 0;
        for(long x=0; x<=Math.min(n, a); x++){
            long tmp = a*x/b - a*(x/b);
            ans = Math.max(ans, tmp);
        }
        
        System.out.println(ans);
    }
}
