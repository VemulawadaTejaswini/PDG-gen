
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
	FastReader sc = new FastReader();
	int n = sc.nextInt();
	Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
	
	for (int i = 0; i < n; i++) {
		int l = sc.nextInt();
		map.put(l, map.getOrDefault(l, 0) + 1);
	}
	
	int res = 0;
	int firstEdge = 0;
	int secondEdge = 0;
	
	for (int key: map.keySet()) {
		int cnt = map.get(key);
		
		if (cnt >= 4) {
			res = key * key;
			break;
		}
		
		if (cnt >= 2) {
			if (firstEdge == 0) {
				firstEdge = key;
			} else {
				secondEdge = key;
			}
		}
		
		if (firstEdge != 0 && secondEdge != 0) {
			res = (firstEdge * secondEdge);
			break;
		}
	}
	
	System.out.println(res);
	
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
