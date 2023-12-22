import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(calcDigit(a, b));
    }
  }

  static int calcDigit(int a, int b) {
    return (int)Math.log10((double)(a + b)) + 1;
  }
}