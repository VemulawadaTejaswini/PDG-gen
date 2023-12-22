import java.util.Scanner;
class Distance {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int a = 0;
    for (int i = 0; i <= N; i++) {
      int X = sc.nextInt();
      int Y = sc.nextInt();
      if (D*D >= X*X + Y*Y) {
        a++;
      }
    }
    System.out.println(a);
  }
}
