
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  int n = sc.nextInt();
	  Map<Integer, Integer> oddMap = new HashMap<>();
	  Map<Integer, Integer> evenMap = new HashMap<>();
	  
	  for (int i = 0; i < n; i++) {
		  int num = sc.nextInt();
		  if (i % 2 == 0) {
			  evenMap.put(num, evenMap.getOrDefault(num, 0) + 1); 
		  } else {
			  oddMap.put(num, oddMap.getOrDefault(num, 0) + 1); 
		  }
	  }
	  int evenCnt = 0;
	  int evenKey = 0; 
	  for (int key: evenMap.keySet()) {
		  if (evenMap.get(key) > evenCnt) {
			  evenCnt = evenMap.get(key);
			  evenKey = key;
		  }
	  }
	  
	  int oddCnt = 0;
	  int oddKey = 0;
	  for (int key: oddMap.keySet()) {
		  if (oddMap.get(key) > oddCnt) {
			  oddCnt = oddMap.get(key);
			  oddKey = key;
		  }
	  }
	  
	  if (oddKey == evenKey) {
		  System.out.println(n/2);
	  } else {
		  System.out.println(n - oddCnt - evenCnt);
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

class Work {
	int spend;
	int earn;
	
	public Work(int spend, int earn) {
		this.spend = spend;
		this.earn = earn;
	}
}
