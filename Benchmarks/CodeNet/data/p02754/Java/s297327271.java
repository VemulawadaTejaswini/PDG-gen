import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = sc.nextInt();
    int r = sc.nextInt();
    
    long ans = b + n - r;
    System.out.println(ans);
  }
}