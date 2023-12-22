import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    /* This comes from the equations c + t = X 
    --> 2c + 2t = 2X and 2c + 4t = Y, so 2t = Y - 2X */
    
    if ((y-2x)%2 == 0) {
      System.out.println("Yes");
    }
    
    System.out.println("No");
  }
}
