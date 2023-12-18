import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    long a = stdIn.nextLong(), b = stdIn.nextLong(), c = stdIn.nextLong();
    long k = stdIn.nextLong();
 
    long ans = (long) Math.pow(-1, k) * (a - b);
 
    if(Math.abs(ans) > (long) Math.pow(10, 18)) {
      System.out.println("' Unfair '");
    }
    else
      System.out.println(ans);
  }
}