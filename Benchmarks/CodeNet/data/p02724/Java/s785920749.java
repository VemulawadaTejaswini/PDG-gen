import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    int fh = a / 500;
    int rest = a - 500 * fh;
    int f = rest / 5;

    int happy = (fh * 1000) + (f * 5);
    System.out.println(happy);
  }
}
