import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int d=sc.nextInt();
        String s="";
        switch(d){
            case 25:
                s="Christmas";
                break;
            case 24:
                s="Christmas Eve";
                break;
            case 23:
                s="Christmas Eve Eve";
                break;
            case 22:
                s="Christmas Eve Eve Eve";
                break;
            default:
                break;
        }
        out.println(s);
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
    //pはqに含まれる
    static boolean D(Point p,Point q){
        return p.x<q.x&&p.y<q.y;
    }
}
