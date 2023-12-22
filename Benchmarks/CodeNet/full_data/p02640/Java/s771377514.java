import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
    if (Y % 2 ==0 && Y >= 2 * X && Y <= 4 * X) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}