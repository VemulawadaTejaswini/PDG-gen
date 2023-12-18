import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int maxA=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            maxA=max(maxA,a[i]);
        }
        int g=0;
        for (int i = 1; i < n; i++) {
            g=gcd(a[i-1],a[i]);
        }
        if(k%g==0&&k<=maxA){
            out.println("POSSIBLE");
        }else{
            out.println("IMPOSSIBLE");
        }
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,b%a);
    }
}