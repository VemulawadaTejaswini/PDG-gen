import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = 0;
    for (int i = 0; i < N; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      result += (r - l + 1);
    }
    System.out.println(result);
  }
}