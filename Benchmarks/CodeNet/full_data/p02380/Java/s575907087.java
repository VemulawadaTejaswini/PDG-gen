import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    double r = c * Math.PI / 180.0;
    double H = b * Math.sin(r);
    double S = a * H / 2;
    double L = a + b + Math.sqrt(H * H + (a - Math.cos(r)) * (a - Math.cos(r)));
    System.out.print(S + "\n" + L + "\n" + H + "\n");
  }
}
