import java.util.Scanner;

public class Main {

  // 参考：https://atcoder.jp/contests/abc158/submissions/10591203
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // longで入るね.
    // https://docs.oracle.com/javase/jp/13/docs/api/java.base/java/lang/Long.html
    // longに設定可能な最大値2**63-1を保持する定数。
    // log10(2) * 63 = 18.964
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long sho = n / (a + b);
    long amari = n % (a + b);
    if(amari > a){
      System.out.println(sho * a + a);
    }else {
      System.out.println(sho * a + amari);
    }
  }
}