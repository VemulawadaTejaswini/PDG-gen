import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e6+1;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        long all = a[0];
        long gcd = a[0];
        boolean pc = true;
        for(int i=1; i<n; i++){
            if(gcd(all, a[i]) > 1){
                pc = false;
            }
            all *= a[i];
            gcd = gcd(gcd, a[i]);
        }
        
        if(pc && gcd==1){
            System.out.println("pairwise coprime");
        }else if(gcd==1){
            System.out.println("setwise coprime");
        }else{
            System.out.println("not coprime");
        }
        
    }
    
    static long gcd (long a, long b){
        return b>0 ? gcd(b,a%b) : a;
    }
}
