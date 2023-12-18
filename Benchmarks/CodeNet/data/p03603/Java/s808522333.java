import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String arg[]) throws IOException { new Main().bw.close(); }

  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  StringTokenizer st = null;
  String nxttok() { 
    try { while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine()); }
    catch(Exception e) { return "";}
    return st.nextToken();
  }

  int nxtint() { return  Integer.parseInt(nxttok()); }
  long nxtlong() { return Long.parseLong(nxttok()); }

  int maxm = 5050;
  int n;
  ArrayList<Integer> gr[];
  int a[];
  int dp[][];

  Main() throws IOException {
    n = nxtint();
    gr = new ArrayList[n];
    gr[0] = new ArrayList<Integer>();
    for (int i = 0; ++i < n; ) {
      int u = nxtint() - 1;
      //System.err.println(u);
      gr[u].add(i);
      gr[i] = new ArrayList<Integer>();
    }
    a = new int[n];
    for (int i = -1; ++i < n; ) a[i] = nxtint();
    dp = new int[n][2];

    for (int u = n; u-- > 0; ) {
      if (gr[u].size() == 0) {
        dp[u][0] = dp[u][1] = 0;
        continue;
      }

      int min0[] = new int[maxm];
      int min1[] = new int[maxm];

      for (int i = -1; ++i < maxm; ) min0[i] = min1[i] = maxm;

      for (int v : gr[u]) {
        for (int i = 0; i < 1; ++i) {
          int t[] = new int[2];
          t[i] = a[v];
          t[1 - i] = dp[v][i];
          
          for (int f = maxm; f-- > 0; ) {
            if (f + t[0] < maxm)
              min0[f + t[0]] = Math.min(min0[f + t[0]], min0[f] + t[1]);
            if (f + t[1] < maxm)
              min1[f + t[1]] = Math.min(min1[f + t[1]], min1[f] + t[0]);
          }
          if (t[0] < maxm) min0[t[0]] = Math.min(min0[t[0]], t[1]);
          if (t[1] < maxm) min1[t[1]] = Math.min(min1[t[1]], t[0]);
        }
      }
      
      dp[u][0] = dp[u][1] = maxm;
      for (int i = 0; i <= a[u]; ++i) {
        dp[u][0] = Math.min(dp[u][0], min0[i]);
        dp[u][1] = Math.min(dp[u][1], min1[i]);
      }
    }
    if (dp[0][0] == maxm && dp[0][1] == maxm) {
      bw.write("IM");
    }
    bw.write("POSSIBLE");
  }
}
