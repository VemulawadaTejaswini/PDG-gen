import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum;
    int x;
    while(true) {
      x = sc.nextInt();
      sum = 0;
      if(x == 0) {
        break;
      } else {
        int l = Integer.toString(x).length();
        for(int i = l - 1; i > 0; i--) {
          int a = x / (int) Math.pow(10, i);
          sum += a;
          x -= (int) (Math.pow(10, i) * a);
          if(i == 1) {
            sum += x;
          }
        }
        System.out.println(sum);
      }
    }
  }
}

