import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        char[][] a=new char[H][W];
        for (int i = 0; i < H; i++) {
            String s=sc.next();
            for (int j = 0; j < W; j++) {
                a[i][j]=s.charAt(j);
            }
        }
        for (int i = 0; i < H; i++) {
            int c=0;
            for (int j = 0; j < W; j++) {
                if(a[i][j]=='.')c++;
            }
            if(c==W){
                for (int j = 0; j < W; j++) {
                    a[i][j]='-';
                }
            }
        }
        for (int i = 0; i < W; i++) {
            int c=0;
            for (int j = 0; j < H; j++) {
                if(a[j][i]=='.'||a[j][i]=='-')c++;
            }
            if(c==H){
                for (int j = 0; j <H; j++) {
                    a[j][i]='-';
                }
            }
        }
        String[] ans=new String[H];
        for (int i = 0; i <H; i++) {
            ans[i]="";
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                ans[i]+=Character.toString(a[i][j]);
            }
        }
        for (int i = 0; i < H; i++) {
            ans[i]=ans[i].replaceAll("-", "");
        }
        for (int i = 0; i < H; i++) {
            if(!ans[i].equals(""))out.println(ans[i]);
        }
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
