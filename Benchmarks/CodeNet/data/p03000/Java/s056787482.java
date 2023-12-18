import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int cnt = 1;
    int length = 0;
    for (int i = 0; i < 3; i++) {
      length += sc.nextInt();
      if (length <= T) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
