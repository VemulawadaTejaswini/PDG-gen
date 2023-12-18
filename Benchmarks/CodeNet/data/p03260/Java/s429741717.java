import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    if (A % 2 == 1 && B % 2 == 1) System.out.println("Yes");
    else System.out.println("No");
  }
}