
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();

    String s = sc.next();

    int l[] = new int[q];
    int r[] = new int[q];
    for (int i = 0; i < q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    for (int i = 0; i < q; i++) {
      String sub = s.substring(l[i] - 1, r[i]);
      //System.out.println(sub);
      int len = sub.length();
      sub = sub.replaceAll("AC", "");
      int nlen = sub.length();
      //System.out.println(sub);
      System.out.println((len - nlen) / 2);
    }
  }
}
