import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i <= s.length()-3; i++) {
            ts.add(abs(753-Integer.parseInt(s.substring(i, i+3))));
        }
        out.println(ts.pollFirst());
    }
    static long power(long x,int n){
        long mod=1000000007;
        long ans=1;
        while (n>0) {
            if((n&1)==1){
                ans=(ans*x)%mod;
            }
            x=(x*x)%mod;
            n>>=1;
        }
        return ans;
    }
    //最大公約数
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
//※最小公倍数はa*b/gcd(a,b)である
}
