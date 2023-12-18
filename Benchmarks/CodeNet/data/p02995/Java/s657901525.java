
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  long a = sc.nextLong();
	  long b = sc.nextLong();
	  long c = sc.nextLong();
	  long d = sc.nextLong();
	  
	  long lcm = (c*d)/ gcd(d, c);
	  
	  long res = (b - (b/c + b/d - b/lcm)) - ((a-1) - ((a-1)/c + (a-1)/d - (a-1)/lcm));
	  
	  System.out.println(res);
  }
 
  private static long gcd(long m, long n) {
	  if (m < n) {
		  return gcd(n, m);
	  }
	  
	  if (n == 0) {
		  return m;
	  }
	  
	  return gcd(n, m % n);
  }
 
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
  
    String next() { 
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() { 
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
        try{
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}
