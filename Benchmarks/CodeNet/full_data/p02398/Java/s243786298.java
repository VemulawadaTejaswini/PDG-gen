import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ary = new ArrayList<>();

    while (true) {
      int input = Integer.parseInt(sc.next());
      ary.add(input);
      if (ary.size() == 3) break;
    }

    int a = ary.get(0);
    int b = ary.get(1);
    int c = ary.get(2);
    int ans = 0;

    for (int i = a; i <= b; i++) {
      if (c % i == 0) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}