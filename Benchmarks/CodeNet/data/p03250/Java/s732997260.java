
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
	  String s = sc.next();
	  String t = sc.next();
	  int[] sCharCnt = new int[26];
	  int[] tCharCnt = new int[26];
	  
	  for (int i = 0; i < s.length(); i++) {
		  sCharCnt[s.charAt(i) - 'a']++;
		  tCharCnt[t.charAt(i) - 'a']++;
	  }
	  
	  Arrays.sort(sCharCnt);
	  Arrays.sort(tCharCnt);
	  
	  List<Integer> sl = new ArrayList();
	  List<Integer> tl = new ArrayList();
	  
	  for (int i = 0; i < sCharCnt.length; i++) {
		  if (sCharCnt[i] != 0) { sl.add(sCharCnt[i]); }
		  if (tCharCnt[i] != 0) { tl.add(tCharCnt[i]); }
	  }
	  
	  if (sl.size() != tl.size()) {
		  System.out.println("No");
		  System.exit(0);
	  } else {
		  for (int i = 0; i < sl.size(); i++) {
			  if (sl.get(i).intValue() != tl.get(i).intValue()) {
				  System.out.println("No");
				  System.exit(0);
			  }
		  }
	  }
	  System.out.println("Yes");
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
