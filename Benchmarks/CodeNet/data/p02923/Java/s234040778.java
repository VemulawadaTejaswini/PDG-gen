import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    int move = 0;
    int prev = sc.nextInt();
    for (int i = 1; i < N; i++) {
      int H = sc.nextInt();
      if (prev >= H) {
        move++;
        max = Math.max(max, move);
      } else {
        move = 0;
      }
      prev = H;
    }
    System.out.println(max);
  }
}