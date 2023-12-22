import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(String.valueOf(n+n^2+n^3));
  }
}