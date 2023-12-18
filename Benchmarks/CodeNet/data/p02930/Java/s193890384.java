import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static int[][] a;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        a = new int[n][n];
        dp(0, n, 1);
        for(int i=0; i<n-1; i++) {
          StringBuilder sb = new StringBuilder();
          for(int j=i+1; j<n; j++) sb.append(a[i][j] + " ");
          out.println(sb.toString());
        }
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
    public static void dp(int begin, int end, int level) {
      if(begin>=end-1) return;
      int mid = (begin+end)/2;
      for(int i = begin; i<mid; i++)
        for(int j=mid; j<end; j++)
          a[i][j] = level;
      dp(begin, mid, level+1);
      dp(mid, end, level+1);

    }
}
