import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    String result = "No";
    if ((y%2 == 0) && (y >= 2*x) && (y <= 4*x)) {
      result = "Yes";
    }
    System.out.println(result);
  }
}
