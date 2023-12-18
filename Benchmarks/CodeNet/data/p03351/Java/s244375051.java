import java.util.Scanner;

public class A {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int ac = Math.abs(c-a);
    int abc = Math.abs(b-a) + Math.abs(c-b);
    int d = scanner.nextInt();

    if ( abc <= d*2 || ac <= d) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}