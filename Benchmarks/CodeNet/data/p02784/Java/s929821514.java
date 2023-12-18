import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt(), N = sc.nextInt();
    int sum = 0;
    for (int i = 0; i < N; i++) sum += sc.nextInt();
    System.out.println((sum >= H) ? "Yes" : "No");
  }
}