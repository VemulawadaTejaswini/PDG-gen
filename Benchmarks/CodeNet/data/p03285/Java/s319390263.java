import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    if (solve(N)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static boolean solve(int N) {
    int a = N % 4;
    switch (a) {
      case 0:
        return true;
      case 1:
        return N >= 21;
      case 2:
        return N >= 14;
      case 3:
        return N >= 7;
    }
    throw new IllegalArgumentException();
  }
}
