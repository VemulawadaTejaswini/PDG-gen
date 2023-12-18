import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {

        int A = in.nextInt();
        int B = in.nextInt();
        int count = sock(A, B, 1);

        return String.valueOf(count);
      }

      public static int sock(int a, int b, int num) {
          if (num >= b) return 0;
          return 1 + sock(a, b-(a-1),num);
      }
      
    
}