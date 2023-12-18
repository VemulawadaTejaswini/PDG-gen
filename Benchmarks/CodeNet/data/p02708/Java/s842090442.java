import java.util.*;
import java.io.*;

public class Main {

 static int mod = (int)(1e9+7);
 
 public static void main(String[] args) {
     
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    int K = in.nextInt();

    System.out.println(possibleWays(N, K, 0, 0));
  }
  
  private static long possibleWays(int N, int k, int pos, int chosen) {
    
      long sum = 0;
      
      for(int i = k; i <= N; i++) {
          sum += (N - i + 1)*(i+1)%mod;
      }
      
      return sum;
  }
  
}