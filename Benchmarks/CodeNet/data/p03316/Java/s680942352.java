import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = calcS(n);
    if ( n % s == 0 ) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
  
  private static int calcS(int n) {
    int val = 0;
    while (n > 0 ) {
      val += n % 10;
      n /= 10;
    }
    return val;
  }
}