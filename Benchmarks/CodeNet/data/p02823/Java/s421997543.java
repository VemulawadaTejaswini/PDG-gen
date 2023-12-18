import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();

      long mid = (b - a -1) % 2 == 1 ? (b - a) / 2 : Long.MAX_VALUE;
      long left = b - 1;
      long right = n - a;
      long min = Math.min(mid, Math.min(left, right));
      
      int cnt = 0;
      if(b - 1 < n - a) { // left
          cnt += a - 1;
          b = b - (a - 1);
          if(b % 2 == 0) {
              cnt++;
              b--;
          }
          cnt += (b-1) / 2;
      } else {
          cnt += n - b;
          a = a + n - b;
          if((a % 2) != (n % 2)) {
            cnt++;
            a++;
          }
          cnt += (n-a) / 2;
      }
     
      System.out.println(Math.min(cnt, min));
  }
}