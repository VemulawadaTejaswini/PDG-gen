import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println(method(a, b, c));
  }
  static int method(int a, int b, int c) {
    int divisor = 0;
    for(int i = a;i < b + 1;i++) {
      if(c % i == 0) {
        divisor++;
      }
    }
    return divisor;
  }
}