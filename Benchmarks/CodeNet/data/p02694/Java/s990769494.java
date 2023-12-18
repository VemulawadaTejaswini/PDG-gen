
    import java.util.Arrays;
    import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong();
    long money = 100;
    long i = 0;

    while (money < x) {
      money += money * 0.01;
      i++;
    }

    System.out.println(i);

  }
}
