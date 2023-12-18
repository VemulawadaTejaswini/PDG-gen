import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int cnt = 0;
      for(int i = 1; i <= n; i++) {
        int digit = numDigit(i);
        if(digit % 2 == 1)
          cnt++;
      }
      System.out.println(cnt);
  }

  private static int numDigit(int n) {
    int cnt = 0;

    while(n > 0) {
      cnt++;
      n /= 10;
    }
    return cnt;
  }
}