import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] strs = str.split(" ");
    long x = Long.parseLong(strs[0]); // 今いる
    long k = Long.parseLong(strs[1]); // 回数
    long d = Long.parseLong(strs[2]); // 変動量

    if (x < 0) x = -x;

    long tmp = Math.floorDiv(x, d);
    if (k < tmp) {
      System.out.println(x - k * d);
      return;
    }
    long a = x - tmp * d;
    k -= tmp;
    System.out.println(Math.abs(x - a - d * (k % 2)));
  }
}