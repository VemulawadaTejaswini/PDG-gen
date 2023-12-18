import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    if (N < 10000) {
      System.out.println("ABC");
    } else {
      System.out.println("ABD");
    }
  }
}
