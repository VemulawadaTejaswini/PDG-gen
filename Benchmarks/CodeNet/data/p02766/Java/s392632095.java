
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int count = 0;
    do {
      n /= k;
      count++;
    } while (n!=0);
    System.out.println(count);

  }

}
