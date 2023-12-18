import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double n = sc.nextDouble();
    double tmp = 0;
    int ans = 0;

    for(int x = 1; x <= n; x++){
      tmp = Math.floor(a * x / b) - a * Math.floor(x / b);

      if(tmp > ans){
        ans = (int)tmp;
      }
    }

    System.out.println(ans);
  }
}
