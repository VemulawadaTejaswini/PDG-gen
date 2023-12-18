import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    String str = scan.next();
    int cnt = 0;

    for (int i = 0; i < n - 2; i++) {
      if (str.substring(i, i + 3).equals("ABC")) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }

}