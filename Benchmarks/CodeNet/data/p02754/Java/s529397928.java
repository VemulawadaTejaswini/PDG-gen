import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = sc.nextInt();
    int r = sc.nextInt();
    int x = 0;
    if(b == 0) {
      System.out.println(x);
    } else {
      int x = n-r;
      System.out.println(x);
    }
  }
}