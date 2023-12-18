
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
	  boolean[] primes = new boolean[10002];
	  int[] counts = new int[10002];
	  Arrays.fill(primes, true);
	  primes[0] = false;
	  primes[1] = false;
	  
	  // pre-process
	  // 1.エラトステネスの篩
	  for (int i = 2; i < 10001; i++) {
		  if (primes[i]) {
			  for (int j = i * 2; j < 10002; j += i) {
				  primes[j] = false;
			  }
		  }
	  }
	  
	  // 2. 2017に似た数を計算
	  for (int i = 2; i < 10002; i++) {
		  if (primes[i] && primes[(i + 1) / 2]) {
			  counts[i]++;
		  }
	  }
	  
	  // 3. prefix sum
	  for (int i = 1; i < 10002; i++) {
		  counts[i] += counts[i-1];
	  }
	  
	  int q = sc.nextInt();
	  
	  for (int i = 0; i < q; i++) {
		  int l = sc.nextInt();
		  int r = sc.nextInt();
		  System.out.println(counts[r] - counts[l-1]);
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
