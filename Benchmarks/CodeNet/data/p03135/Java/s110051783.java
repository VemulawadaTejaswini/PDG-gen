import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String strT = scan.next();
    String strX = scan.next();
    
    double t = Double.parseDouble(strT);
    double x = Double.parseDouble(strX);
    
    double realTime = t / x;
    
    System.out.print(realTime);
  }
}