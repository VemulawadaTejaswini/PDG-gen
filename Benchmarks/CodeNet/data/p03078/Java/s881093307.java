
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  int x = sc.nextInt();
	  int y = sc.nextInt();
	  int z = sc.nextInt();
	  int k = sc.nextInt();
	  long[] a = new long[x];
	  long[] b = new long[y];
	  long[] c = new long[z];
	  
	  for (int i = 0; i < x; i++) {
		  a[i] = sc.nextLong();
	  }
	  
	  for (int i = 0; i < y; i++) {
		  b[i] = sc.nextLong();
	  }
	  
	  for (int i = 0; i < z; i++) {
		  c[i] = sc.nextLong();
	  }
	  
	  Long[] xy = new Long[x*y];
	  
	  for (int i = 0; i < x; i++) {
		  for (int j = 0; j < y; j++) {
			  int index = i * x + j;
			  xy[index] = a[i] + b[j];
		  }
	  }
	  Arrays.sort(xy, Collections.reverseOrder());
	  Long[] xyFirstK;
	  
	  if (x*y >= k) {
		  xyFirstK = new Long[k];
		  for (int i = 0; i < k; i++) {
			  xyFirstK[i] = xy[i];
		  }
	  } else {
		  xyFirstK = xy;
	  }
	  
	  List<Long> res = new LinkedList<>();
	  Long[] kz = new Long[xyFirstK.length*z];
	  for (int i = 0; i < z; i++) {
		  for (int j = 0; j < xyFirstK.length; j++) {
			  int index = i * xyFirstK.length + j;
			  kz[index] = xyFirstK[j] + c[i];
		  }
	  }
	  
	  /*for (int i = 0; i < xyFirstK.length; i++) {
		  for (int j = 0; j < z; j++) {
				  res.add(xyFirstK[i] + c[j]);
			  
		  }
	  }*/
	  Arrays.sort(kz, Collections.reverseOrder());
	  
	  for (int i = 0; i < k; i++) {
		  
			  System.out.println(kz[i]);
		  
	  }
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
