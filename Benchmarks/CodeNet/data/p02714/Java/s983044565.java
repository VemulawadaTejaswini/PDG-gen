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
        char[] str = S.toCharArray();
        long ans = 0;
        for (int i = 0; i < N-2; i++) {     
          for (int j = i+1; j < N-1; j++) {
            if (str[i] == str[j]) continue;
            for (int k = j+1; k < N; k++) {
              if (j-i == k-j) continue;
              if (str[i] != str[j] && str[j] != str[k] && str[i]!= str[k] && j-i != k-j) ans++;
            }
          }
        }
        return String.valueOf(ans);
      }
      
    
}