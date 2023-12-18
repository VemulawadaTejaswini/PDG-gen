import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
        
        long x = Math.min(n, b-1);
        
        System.out.println(a*x/b - a*(x/b));
    }
}
