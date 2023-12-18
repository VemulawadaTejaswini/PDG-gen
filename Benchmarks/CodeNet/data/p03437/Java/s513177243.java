import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long X = scanner.nextLong();
    long Y = scanner.nextLong();

    new Main().execute(X, Y);
  }

  public void execute(long X, long Y) {
    long MAX = (long)Math.pow(10, 18);
    if (X % Y == 0) {
      System.out.println("−1");
      return;
    }

    for (long i = 2; i < Y + 1; i++) {
      long multiple = X * i;
      if ((multiple % Y) != 0 && multiple <= MAX) {
        System.out.println(multiple);
        return;
      }
    }

    System.out.println("−1");
  }

}
