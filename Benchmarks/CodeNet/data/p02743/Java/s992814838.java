import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    double a, b, c;
    Scanner scan = new Scanner(System.in);
    
    a = scan.nextDouble();
    b = scan.nextDouble();
    c = scan.nextDouble();
    
    double a1 = Math.sqrt(a);
    double b1 = Math.sqrt(b);
    double c1 = Math.sqrt(c);
    
    if(a1 + b1 < c1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}