import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
        String K = in.next();
        for (int i = 0; i < K.length(); i++) {
          if (K.charAt(i) == '7') return "Yes";
        }
        return "No";
      }
      
    
}