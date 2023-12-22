import java.util.*;

public class Main {
  private static final double MAX = 1e18;
  
  public static void main(String args[]) {
  	long multiplication = 1;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i=0; i<n; i++) {
      int num = in.nextInt();
      multiplication *= num;
      if (multiplication == 0) {
        break;
      }
      
      if (multiplication > MAX) {
        System.out.print(-1);
        return;
      }
    }
    
    System.out.print(multiplication);
  }
}
