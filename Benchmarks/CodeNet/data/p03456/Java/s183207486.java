import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = Integer.parseInt(Integer.toString(a) + b);
    int i = 1;
    while (i * i <= c) i++;
    i--;
    if (i * i == c) System.out.println("Yes");
    else System.out.println("No");
  }
}
