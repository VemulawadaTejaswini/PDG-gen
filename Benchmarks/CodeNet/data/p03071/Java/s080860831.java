import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int ans = 0;
    if (a > b) {
      ans += a;
      a--;
    } else {
      ans += b;
      b--;
    }
    if (a > b) {
      ans += a;
      a--;
    } else {
      ans += b;
      b--;
    }
    System.out.println(ans);
  }

}
