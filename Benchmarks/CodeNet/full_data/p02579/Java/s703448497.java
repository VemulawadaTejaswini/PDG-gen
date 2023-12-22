import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	PrintWriter out = new PrintWriter(System.out);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok = new StringTokenizer("");
    String next() throws IOException {
        if (!tok.hasMoreTokens()) { tok = new StringTokenizer(in.readLine()); }
        return tok.nextToken();
    }
    int ni() throws IOException { return Integer.parseInt(next()); }
    long nl() throws IOException { return Long.parseLong(next()); }
    
    int[][]A,S;
    int h,w,ss,ts;
    
    
    void solve() throws IOException {
        for (int tc=1;tc>0;tc--) {
            h=ni();
            w=ni();
            int si=ni(),sj=ni(),ti=ni(),tj=ni();
            A=new int[h+1][w+1];
            for (int i=1;i<=h;i++) {
                String s=next();
                for (int j=0;j<w;j++)
                    if (s.charAt(j)=='#') A[i][j+1]=1;
            }
            
            int set=2;
            for (int i=1;i<=h;i++) {
                for (int j=1;j<=w;j++) {
                    if (A[i][j]==0) dfs(i,j,set);
                    set++;
                }
            }
            
            S=new int[set][set];
            for (int i=1;i<=h;i++) {
                for (int j=1;j<=w;j++) {
                    int u=A[i][j];
                    if (u<2) continue;
                    for (int x=Math.max(1,i-2);x<=Math.min(h,i+2);x++) {
                        for (int y=Math.max(1,j-2);y<=Math.min(w,j+2);y++) {
                            int v=A[x][y];
                            if (v>1) S[u][v]=1;
                        }
                    }
                }
            }
            
            /*ss=A[si][sj];
            ts=A[ti][tj];
            int[]D=new int[set];
            Arrays.fill(D,-1);
            D[ts]=0;
            int p=0;
            while (D[ss]==-1) {
                boolean f=true;
                for (int i=2;i<set;i++) {
                    if (D[i]==p) {
                        for (int j=2;j<set;j++) {
                            if (D[j]==-1 && S[i][j]==1) { f=false; D[j]=p+1; }
                        }
                    }
                }
                p++;
                if (f) break;
            }
            out.println(D[ss]);*/
            out.println(0);
        }
        out.flush();
    }
    
    void dfs(int i,int j,int s) {
        A[i][j]=s;
        if (j<w && A[i][j+1]==0) dfs(i,j+1,s);
        if (i<h && A[i+1][j]==0) dfs(i+1,j,s);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}