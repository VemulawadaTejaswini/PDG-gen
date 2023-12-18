import java.util.*;
class Main {
  public static void main(String[]agrs) {
    Scanner scanner = new scanner(System.in);
    int h = scanner.nextInt();
    int a = scanner.nextInt();
    
    double aN = Math.ceil(h/a);

    System.out.println(aN);
  }
}