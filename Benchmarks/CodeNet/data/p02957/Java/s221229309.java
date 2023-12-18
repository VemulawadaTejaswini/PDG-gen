import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String strA = scan.next();
    String strB = scan.next();
    
    int a = Integer.parseInt(strA);
    int b = Integer.parseInt(strB);
    
    int c = a + b;
    
    if (c % 2 == 0) {
      System.out.print(c / 2);
    } else {
      System.out.print("IMPOSSIBLE");
    }
  }
}