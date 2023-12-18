
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // AtCoder Beginner Contest 124
	// https://atcoder.jp/contests/abc124/tasks
  public static void main(String[] args) {
    FastReader sc = new FastReader();
	int n = sc.nextInt();
	long[] clocks = new long[n];
	long res = 1;
	long maxValue = 0;
	for (int i = 0; i < n; i++) {
	  clocks[i] = sc.nextLong();
	  res *= clocks[i];
	  maxValue = Math.max(maxValue, clocks[i]);
	}
		
	if (n == 1) {
	  System.out.println(clocks[0]);
	  System.exit(0);
	}
	
	long gcd = gcd(clocks[0], clocks[1]);
	
	for (int i = 2; i < n; i++) {
		gcd =gcd(gcd, clocks[i]);
	}
	
	if (gcd == 1) {
		System.out.println(maxValue);
		System.exit(0);
	}
	
	System.out.println(res/gcd);
	
  }
  private static long gcd(long m, long n) {
	  if (m < n) { return gcd(n, m); }
	  if (n == 0) { return m; }
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
