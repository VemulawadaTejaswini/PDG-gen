import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
  public static int[] a,b;
  public static int n;
  public static int[][] necessary;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        a = new int[n];
        b = new int[n];

        for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) b[i] =  Integer.parseInt(st.nextToken());

        necessary = new int[51][51];
        for(int i=0; i<51; i++) for(int j=0; j<51; j++) necessary[i][j] = -1;
        for(int mod=1; mod<=50; mod++) {
          for(int i=0; i<51; i++) {
            for(int j=0; j<i; j++) {
              if(necessary[i][j] != -1) continue;
              int newi = i % mod;
              if(newi < j) continue;
              if((newi == j) || (necessary[newi][j] != -1)) necessary[i][j] = mod;
            }
          }
        }
        //System.out.println(necessary[19][0]);
        for(int i=0; i<n; i++) {
          if((a[i] != b[i]) && (necessary[a[i]][b[i]] == -1)) {
            out.println("-1");
            out.close(); System.exit(0);
          }
        }
        Set<Integer> mods = new HashSet<Integer>();
        while(true) {
          int max_nec = -1;
          int index = -1;
          for(int i=0; i<n; i++) {
            int val = a[i];
            while((val != b[i])) {
              int nec = necessary[val][b[i]];
              if(nec > max_nec) {
                max_nec = nec;
                index = i;
              }
              val %= nec;
            }
          }
          if(max_nec == -1) break;
          mods.add(max_nec);
        //  out.println(a[index] + " " + max_nec);
          a[index] %= max_nec;
          for(int i=0; i<51; i++) necessary[i][i] = 0;
          for(int i=0; i<n; i++) {
            boolean[] dp = new boolean[51];
            dp[b[i]] = true;
            for(int k=b[i]+1; k<51; k++) {

              for(int m : mods) {
                if((k%m >= b[i]) && (necessary[k%m][b[i]] > -1))
                  necessary[k][b[i]] = Math.min(necessary[k][b[i]], necessary[k%m][b[i]]);

              }
            }
            if(necessary[a[i]][b[i]] == 0) a[i] = b[i];
          }

        }
        long ans = 0;
        for(int i : mods) ans += 1L<<i;
        out.println(ans);

        out.close(); System.exit(0);
    }



}
