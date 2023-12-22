import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long debt = 100000;
    for (int i = 0; i < n; i++) {
      debt = (long) (debt * 1.05);
      if (debt % 1000 > 0) {
        debt = (debt / 1000 + 1) * 1000;
      }
    }
    System.out.println(debt);
  }
}

