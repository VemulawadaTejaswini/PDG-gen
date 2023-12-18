import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
        int N = in.nextInt();
        String S = in.next();
        long ans = 0;
        for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
              char a = S.charAt(i);
              char b = S.charAt(j);
              char c = S.charAt(k);
              if (a != b && b != c && c!= a && j-i != k-j && i < j && j < k) ans++;
            }
          }
        }
        return String.valueOf(ans);
      }
      
    
}