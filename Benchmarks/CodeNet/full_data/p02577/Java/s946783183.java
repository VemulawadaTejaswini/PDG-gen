import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long sum = 0;
    for (int N = 0; i < N.length(); i++) {
      sum += N.charAt(i);
    }
    if (sum % 9 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}