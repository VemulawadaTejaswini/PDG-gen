import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    if ((g * 10 + b) % 4 == 0) { 
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}