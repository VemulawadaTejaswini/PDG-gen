import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e6+1;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            h.put(a[i], h.getOrDefault(a[i], 0)+1);
        }
        Arrays.sort(a);
        
        boolean[] prime = new boolean[MAX];
        Arrays.fill(prime, true);
        boolean pc = true;
        for(int i=2; i<MAX; i++){
            if(!prime[i]){
                continue;
            }
            int cnt = 0;
            for(int j=i; j<MAX; j+=i){
                prime[j] = false;
                cnt += h.getOrDefault(j, 0);
            }
            if(cnt > 1){
                pc = false;
            }
        }
        
        long gcd = a[0];
        for(int i=1; i<n; i++){
            gcd = gcd(a[i], gcd);
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
        if(a < b){
            return gcd(b, a);
        }
        return b>0 ? gcd(b,a%b) : a;
    }
}
