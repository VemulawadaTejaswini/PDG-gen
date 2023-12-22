import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = 1000000000 + 7;
        long answer = (powMod(10,n,mod)-2*powMod(9,n,mod)+powMod(8,n,mod)+mod)%mod;
        System.out.println(answer);
    }
    public static long powMod(long a, long b, long mod) {
        long p = 1;
        for (int i=0;i<b;i++) {
            p=p*a%mod;
        }
        
        return p;
    }
}
