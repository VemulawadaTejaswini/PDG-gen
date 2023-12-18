import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Long> fl = getFactorialList(Math.max(n,m));
        if(Math.abs(m-n) > 1){
            System.out.println(0);
        }else if(n == m){
            System.out.println((fl.get(n-1) * fl.get(m-1)) % mod * 2 % mod);
        }else{
            System.out.println(fl.get(n-1) * fl.get(m-1) % mod);
        }
        
    }
    
    public static ArrayList<Long> getFactorialList(int n){
        long mod = (long)Math.pow(10,9)+7;
        ArrayList<Long> ret = new ArrayList<Long>();
        if(n <= 0){
            return ret;
        }
        long now = 1;
        for(int i = 1; i <= n; i++){
            now *= i;
            now %= mod;
            ret.add(now);
        }
        return ret;
    }
}