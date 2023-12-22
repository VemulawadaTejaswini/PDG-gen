import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      int sum = 0;
      int d = sc.nextInt();

      for (int i = 0, size = 600 / d; i < size; i++) {
        sum += f(i * d) * d;
      }

      System.out.println(sum);
    }
  }

  static int f(int x) {
    return x * x;
  }
}