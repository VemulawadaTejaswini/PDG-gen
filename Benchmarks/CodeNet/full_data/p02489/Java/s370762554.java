import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x;
    int cnt = 0;

    while(x = sc.nextInt() != 0) {
      System.out.println("Case " + ++cnt + ": " + x); 
    }
  }
}