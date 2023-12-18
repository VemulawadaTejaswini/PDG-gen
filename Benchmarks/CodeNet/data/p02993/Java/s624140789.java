import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int prev = n % 10;
      n /= 10;
      while(n > 0) {
        int cur = n % 10;
        if(prev == cur) {
          System.out.println("Bad");
          return;
        }
        prev = cur;
        n /= 10;
      }
      System.out.println("Good");
  }
}