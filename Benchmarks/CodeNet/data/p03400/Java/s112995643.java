import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    final int N = s.nextInt();
    final int D = s.nextInt();
    final int X = s.nextInt();
    
    int chocolate = 0;
    for (int i = 0; i < N; i++) {
    	int a_i = s.nextInt();
    	int day = 1;
    	while (day <= D) {
    		//System.out.println(day);
    		chocolate++;
    		day += a_i;
    	}
    }
    
    System.out.println(chocolate + X);
 
  }
}