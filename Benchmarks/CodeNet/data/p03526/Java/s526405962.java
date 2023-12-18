import java.util.*;
import java.io.*;

public class Main {
  static List<Integer>[] adj;
  static int[] par, ans, size;
  static int n;
  public static void main(String[] args) {
    long INF = (long) 1e18 + 7l;
    // System.out.println(new Pair(2, 3).compareTo(new Pair(3, 2)));
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    // FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    
    int n = in.nextInt();
    Pair[] ps = new Pair[n];
    for (int i = 0; i < n; i++) {
      ps[i] = new Pair(in.nextInt(), in.nextInt());
    }

    Arrays.sort(ps, (a, b) -> (a.a + a.b - b.a - b.b));


    // dp[i][j]: min height with j actors chosed from the actors ending at i 
    // int[][] dp = new int[n + 1][n + 1];
    // for (int i = 1; i <= n; i++) {Arrays.fill(dp[i], INF);}
    // for (int i = 1; i <= n; i++) {dp[0][i] = 0;}

    long[] dp = new long[n + 1];
    Arrays.fill(dp, INF);
    dp[0] = 0;

    for (int i = 0; i < n; i++) {
      // for (int j = 1; j <= i; j++) {
      for (int j = i; j > 0; j--) {
        // dp[i][j] = dp[i - 1][j];
        // if (ps[i - 1].a >= dp[i - 1][j - 1]) dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + ps[i - 1].b);
        if (ps[i].a >= dp[j - 1]) dp[j] = Math.min(dp[j], dp[j - 1] + ps[i].b);
      }
      // Jren.p(dp);
    }

    for (int i = n; i > 0; i--) {
      if (dp[i] < INF) {System.out.println(i); return;}
    }
    





    }
  


  static class Pair implements Comparable<Pair> {
    int a, b;
    Pair (int aa, int bb) {a = aa; b = bb;}
    @Override
    public int compareTo(Pair y) {
      return 0;
    }
    @Override
    public String toString() {
      return "(" + a + ", " + b + ")";
    }
  }

  

  
  

  static class FastReader {

    public BufferedReader br; 
    StringTokenizer st; 

    public FastReader() {br = new BufferedReader(new InputStreamReader(System.in));} 

    String next() { 
      while (st == null || !st.hasMoreElements()) { 
          try {st = new StringTokenizer(br.readLine());} 
          catch (IOException e) {e.printStackTrace();} 
      } 
      return st.nextToken(); 
    } 

    int nextInt() {return Integer.parseInt(next());} 

    long nextLong() {return Long.parseLong(next());} 

    double nextDouble() {return Double.parseDouble(next());} 

    String nextLine() {
      String str = ""; 
        try {str = br.readLine();} 
        catch (IOException e) {e.printStackTrace();} 
        return str; 
  }
}

} 

  



  
  


  













