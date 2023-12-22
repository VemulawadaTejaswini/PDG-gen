import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double n = sc.nextDouble();
    boolean bool = true;
    double x = 0;
    double tmp = 0;
    int ans = 0;

    while(bool){
      tmp = Math.floor(a * x / b) - a * Math.floor(x / b);

      if(tmp > ans){
        ans = (int)tmp;
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
