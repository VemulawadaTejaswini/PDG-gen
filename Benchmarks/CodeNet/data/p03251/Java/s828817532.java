
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  int n = sc.nextInt();
	  int m = sc.nextInt();
	  int x = sc.nextInt();
	  int y = sc.nextInt();
	  
	  int[] numX = new int[n];
	  int[] numY = new int[m];
	  
	  for (int i = 0; i < n; i++) {
		  numX[i] = sc.nextInt();
	  }
	  
	  for (int i = 0; i < m; i++) {
		  numY[i] = sc.nextInt();
	  }
	  
	  Arrays.sort(numX);
	  Arrays.sort(numY);
	  
	  for (int i = x + 1; i <= y; i++) {
		  if (numX[n-1] < i && i <= numY[0]) {
			  System.out.println("No War");
			  System.exit(0);
		  }
	  }
	  System.out.println("War");
	  System.exit(0);
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
