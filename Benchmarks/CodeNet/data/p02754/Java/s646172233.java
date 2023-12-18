import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = sc.nextInt();
    int r = sc.nextInt();
    
    int x = b + n;
    int y = x - r;
    System.out.println(y);
  }
}