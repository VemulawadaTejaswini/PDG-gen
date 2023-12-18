import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long g = gcd(A, B);
    
    int ans = 1;
    long f = (long)Math.sqrt(g);
    for(int i = 2; i <= g && i <= f+1; i++){
      boolean c = false;
      while(g%i == 0){
        c = true;
        g /= i;
      }
      if(c){
        ans++;
      }
    }
    
    System.out.println(ans);
  }
  public static long gcd(long a, long b){
    if(a < b){
      return gcd(b, a);
    }
    if(b == 0){
      return a;
    }
    
    return gcd(b, a%b);
  }
}
