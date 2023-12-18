import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
        int K = in.nextInt();
        if (K <= 9) return String.valueOf(K);
        int min = 9;
        for (long i = 10; i <= Long.MAX_VALUE; i++) {
          String num = String.valueOf(i);
          boolean lunlun = true;
          for (int j = 1; j < num.length(); j++) {
            int c = Character.getNumericValue(num.charAt(j-1));
            int c2 = Character.getNumericValue(num.charAt(j));
            if (Math.abs(c - c2) > 1) {
              lunlun = false;
              break;
            }
          }
          
          if (lunlun) {
            min++;
          }
          if (K == min) return num;
        }
        return String.valueOf(-1);
      }
    
}