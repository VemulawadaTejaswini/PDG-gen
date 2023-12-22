import java.util.Scanner;
class Main {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int a = 0;
    for (int i = 1; i <= N; i++) {
      int X = sc.nextInt();
      int Y = sc.nextInt();
      double math = Math.sqrt(X^2+Y^2);
      if (D >= math) {
        a++;
      }
    }
    System.out.println(a);
  }
}