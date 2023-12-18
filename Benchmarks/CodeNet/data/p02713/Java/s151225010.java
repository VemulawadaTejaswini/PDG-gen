import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int K = sc.nextInt();
    int ans = 0;
    for(int a=1;a<=K;a++){
      for(int b=1;b<=K;b++){
        for(int c=1;c<=K;c++){
          ans=ans+gcd(gcd(a,b),c);
        }
      }
    }
    System.out.println(ans);
    }
    

  //最大公約数・最小公倍数（セットで使う）
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
  static int lcm (int a, int b) {return a*b/gcd(a,b);}
  
}
