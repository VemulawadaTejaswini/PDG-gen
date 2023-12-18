import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int aa = a;
    int bb = b;

    while (true) {
      if (a > b) {
        b += bb;
      } if (a < b) {
        a += aa;
      } else{
        System.out.println(a);
        break;
      }
    }
  }
}