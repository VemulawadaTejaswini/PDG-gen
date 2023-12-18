import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), K = sc.nextInt();
    System.out.println(N % K == 0) ? 0 : 1;
  }
}