import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextLine();
    System.out.println(n * n);
    scanner.close();
  }
}