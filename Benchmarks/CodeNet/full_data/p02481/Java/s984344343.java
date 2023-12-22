import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();

    int area = w * h;
    int length = (w + h) * 2;

    System.out.println(area + " " + length);
  }
}