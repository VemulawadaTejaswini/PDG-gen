import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int min = 1000000;
    int max = -1000000;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt();
      if (x < min) min = x;
      if (max < x) max = x;
      sum += x;
    }

    System.out.println(min + " " + max + " " + sum);
    scanner.close();
  }
}