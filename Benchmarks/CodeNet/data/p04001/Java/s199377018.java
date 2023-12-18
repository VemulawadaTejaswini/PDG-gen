
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	  solveC();
	  
  }
  
  private static void solveC() {
	  FastReader sc = new FastReader();
	  String s = sc.next();
	  long[] res = new long[2];
	  helper(s, 1, s.substring(0, 1) , res);
	  System.out.println(res[0]);
  }
  
  private static void helper(String s, int pos, String currTmp, long[] res) {
	  if (pos == s.length()) {
		  // System.out.println(currTmp);
		  res[0] += computeFormula(currTmp);
	  } else {
		  if (pos < s.length()) {
			  helper(s, pos + 1, currTmp + s.charAt(pos), res);
			  helper(s, pos + 1, currTmp + "+" + s.charAt(pos), res);
		  }
	  }
  }

  private static long computeFormula(String s) {
	  long res = 0;
	  long num = 0;
	  for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  
		  if (c == '+') {
			  res += num;
			  num = 0;
		  } else {
			  num *= 10;
			  num += c - '0';
			  if (i == s.length() - 1) {
				  res += num;
				  num = 0;
			  }
		  }
	  }

	  return res;
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
