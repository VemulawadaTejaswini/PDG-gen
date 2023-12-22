import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double n = sc.nextDouble();
    boolean boo = true;
    double x = 1;
    double tmp = 0;
    int ans = 0;

    while(boo){
      tmp = Math.floor(a * x / b) - a * Math.floor(x / b);
      boolean bool = true;

      if(tmp > ans){
        ans = (int)tmp;
      }

      if(x == n){
        boo = false;
        break;
      } else if(x + b > n){
        x = n;
      } else {
        while(bool){
          if(a * (x + b) % b == 0){
            x += b;
            bool = false;
            break;
          } else {
            x += b;
          }
        }
      }    
    }

    System.out.println(ans);
  }
}
