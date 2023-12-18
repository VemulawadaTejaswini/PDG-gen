import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int len = S.length();
    long sum = 0;
    for(int i = len - 1; i >= 0; i--) {
      String s = String.valueOf(S.charAt(i));
      long digit = Integer.parseLong(s);
      for(int k = 0; k < len - i; k++) {
        sum += digit * (long)Math.pow(10, k) * (long)Math.pow(2, len - 2 - i - k);
      }
    }
    System.out.println(sum);
  }
}