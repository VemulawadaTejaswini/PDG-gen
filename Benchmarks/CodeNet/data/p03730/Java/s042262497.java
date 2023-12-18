import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int m = lcm(a,b);
    if(C%m==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  
  //最大公約数・最小公倍数（セットで使う）
public static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
public static int lcm (int a, int b) {return a*b/gcd(a,b);}

  
}
