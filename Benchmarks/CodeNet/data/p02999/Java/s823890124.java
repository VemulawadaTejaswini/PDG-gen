import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    
    int x = scan.nextInt();
    int a = scan.nextInt();
    
    if (x < a) System.out.println(0);
    if (x >= a) System.out.println(10);
  }
}