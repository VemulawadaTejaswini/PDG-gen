import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long b = sc.nextInt();
    long r = sc.nextInt();
    long x = 0;
    if(b == 0) {
      System.out.println(x);
    } else {
      x = n-r;
      System.out.println(x);
    }
  }
}