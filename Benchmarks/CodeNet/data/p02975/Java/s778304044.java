import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      
      int xor = 0;
      for (int i = 0; i < N; ++i) {
        xor ^= in.nextInt();
      }
      
      if (xor == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}