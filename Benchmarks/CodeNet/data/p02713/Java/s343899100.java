import java.util.*;
 
public class Main{
  static int gcd (int a, int b) {return b>0 ? gcd(b, a%b) : a;}
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long ans = 0;
    for(int a = 1 ; a <= k ; a++){
      for(int b = 1; b <= k ; b++){
        for(int c = 1; c <= k; c++){
          ans += gcd(gcd(a,b),c);
        }
      }
    }
    System.out.println(ans);
  }
}