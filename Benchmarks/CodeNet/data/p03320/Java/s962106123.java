import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();

    for (int i=1; i <= k; i++) {
      if (i==10) {
        break;
      }
      System.out.println(i);
    }

    long tmp_ans = 19;

    if (k >= 10) {
      k = k - 9;

      while (k > 0) {
        System.out.println(tmp_ans);
        tmp_ans += 10;
        k--;
      }
    }
  }
}
