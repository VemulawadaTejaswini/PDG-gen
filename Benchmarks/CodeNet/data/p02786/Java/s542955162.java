import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    long h = sc.nextLong();

    // n段のピラミッド
    int cnt = 1;
    while (h / 2 > 1) {
      h = h / 2;
      cnt++;
    }

    Double d = 0d;
    for (int i = 0; i < cnt + 1; i++) {
      d += Math.pow(2, i);
    }
    System.out.println(d.longValue());
  }
}
