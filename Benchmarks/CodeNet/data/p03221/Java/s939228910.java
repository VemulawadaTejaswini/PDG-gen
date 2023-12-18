
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
	FastReader sc = new FastReader();
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[][] p = new int[m][2];
	
	Map<Integer, LinkedList<Integer>> map = new TreeMap<>();
	
	for (int i = 0; i < m; i++) {
		int k = sc.nextInt();
		int y = sc.nextInt();
		p[i][0] = k;
		p[i][1] = y;
		if (!map.containsKey(k)) {
			map.put(k, new LinkedList<Integer>());
		}
		map.get(k).add(y);
	}

	for (int key: map.keySet()) {
		Collections.sort(map.get(key));
	}
	
	
	for (int i = 0; i < m; i++) {
		int k = p[i][0];
		int y = p[i][1];
		int no = 1;
		
		for (int num: map.get(k)) {
			if (num == y) {
				break;
			}
			no++;
		}
		System.out.println(paddingLeft(String.valueOf(k), 6, '0') + "" + paddingLeft(String.valueOf(no), 6, '0'));
	}
  }
  
  private static String paddingLeft(String s, int pad, char c) {
	  int left = pad - s.length();
	  while (left > 0) {
		  s = c + s;
		  left--;
	  }
	  return s;
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
