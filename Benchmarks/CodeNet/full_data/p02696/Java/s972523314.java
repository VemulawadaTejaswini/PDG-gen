import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    boolean bool = true;
    long x = 0;
    long tmp = 0;
    long ans = 0;

    while(bool){
      tmp = (a * x / b) - a * (x / b);

      if(tmp > ans){
        ans = tmp;
      }

      if(x == n){
        bool = false;
        break;
      } else if(x + b > n){
        x = n;
      } else if(x + b < n){
        x += b;
      }
    }

    System.out.println(ans);
  }
}
