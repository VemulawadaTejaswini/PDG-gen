import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();

    long cnt = (K % 2 == 1 ? N/K : N/(K/2));

    if (K % 2 == 0) {
      long n1 = cnt/2;
      long n2 = cnt - n1;
      System.out.println(n1*n1*n1 + n2*n2*n2);
    } else {
      System.out.println(cnt*cnt*cnt);
    }
  }
}