import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
	public static void main (String[] args) throws IOException {    
    String[] first = br.readLine().split(" ");
    long L = Long.parseLong(first[0]);
    long R = Long.parseLong(first[1]);
    
    long Aminus1 = F(L-1);
    long B = F(R);
    
    // System.out.println(Aminus1 + " " + B);
    
    long ans = Aminus1 ^ B;
    
    bw.write(ans + "");
    
    bw.close();
	}
  
  public static long F(long X) {
    long ans = 0;
    
    if(X % 2 == 0) {
      if((X / 2) % 2 == 0) {
        ans = ans ^ 0;
      }
      else {
        ans = ans ^ 1;
      }
      
      ans = ans ^ X;
    }
    else {
      if((X / 2) % 2 == 0) {
        ans = ans ^ 1;
      }
      else {
        ans = ans ^ 0;
      }
    }
    
    return ans;
  }
}
