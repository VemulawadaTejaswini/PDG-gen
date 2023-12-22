import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int tmp = 100;
    int cnt = 0;

    while (true) {
      cnt++;
      tmp += tmp * 1 / 100;
      if (tmp >= x) {
        System.out.println(cnt);
        return;
      }
    }

  }

}