import java.util.Scanner;
class Main {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double N = sc.nextInt();
    double D = sc.nextInt();
    int a = 0;
    for (int i = 0; i <= N; i++) {
      double X = sc.nextInt();
      double Y = sc.nextInt();
      if (D*D >= X*X + Y*Y) {
        a++;
      }
    }
    System.out.println(a);
  }
}
