import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long x = sc.nextLong();

    double temp = 100;
    long l = (long) temp;
    long cnt = 0;

    while (l < x) {
      temp = (double) l;
      cnt++;
      temp = temp * 1.01;
      l = (long) temp;
    }

    System.out.println(cnt);

  }
}
