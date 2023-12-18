import java.util.*;
class Main {
  public static void main(String[]agrs) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int a = scanner.nextInt();
    
    double aN = h/a;
    aN = Math.ceil(aN);
    aN = (int)aN;
 
    System.out.println(aN);
  }
}