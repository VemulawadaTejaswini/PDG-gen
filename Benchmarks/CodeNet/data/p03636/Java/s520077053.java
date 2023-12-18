import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int N = s.length();

    System.out.println("" + s.charAt(0) + (N - 2) + s.charAt(N - 1));
  }
}

