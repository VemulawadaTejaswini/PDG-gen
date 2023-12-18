import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long K = Long.parseLong(sc.next());
    long ans = 0;
    long add = 1;
    for (long i = 0; i < K; i++) {
      if (i > 8) {
        add = 10;
      }
      ans += add;
      System.out.println(ans);
    }
  }
}