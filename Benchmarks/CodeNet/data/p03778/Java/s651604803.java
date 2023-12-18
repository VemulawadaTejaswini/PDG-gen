import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        int W = sc.nextInt();
        int a=sc.nextInt();
        int b =sc.nextInt();
        if(a+W<b){
            System.out.println(b-(a+W));
            return;
        }else if(b+W<a){
            System.out.println(a-(b+W));
            return;
        }else{
            System.out.println(0);
        }

    }

      //最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}

}