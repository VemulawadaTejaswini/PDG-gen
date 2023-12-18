import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int s = scanner.nextInt();
    int cnt = 0;
    while (s != 4) {
      if (s % 2 == 0) {
        s /= 2;
      } else {
        s = s * 3 + 1;
      }
      cnt++;
    }
    System.out.println(cnt + 4);

  }

}
