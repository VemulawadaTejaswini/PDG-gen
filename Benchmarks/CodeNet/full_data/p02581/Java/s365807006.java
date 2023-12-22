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
    
    int[]A;
    int[][][]D;
    int n,p;
    
    void solve() throws IOException {
        n=ni();
        p=n*3;
        A=new int[n*3];
        for (int i=0;i<3*n;i++) A[i]=ni();
        D=new int[p][n+1][n+1];
        for (int i=0;i<p;i++) {
            for (int j=0;j<=n;j++) Arrays.fill(D[i][j],-1);
        }
        
        out.println(dp(0,A[0],A[1]));
        out.flush();
    }
    
    int dp(int u,int x,int y) {
        if (u==p-3) {
            if (x==y && x==A[p-1]) return 1;
            else return 0;
        }
        
        if (D[u][x][y]>-1) return D[u][x][y];
        
        int[]B=new int[5];
        int[]C=new int[5];
        B[0]=x;
        C[0]=1;
        if (y==x) { C[0]++; }
        else { B[1]=y; C[1]=1; }
        
        for (int i=2;i<5;i++) {
            for (int j=0;j<5;j++) {
                if (B[j]==0) { B[j]=A[u+i]; C[j]=1; break; }
                if (B[j]==A[u+i]) { C[j]++; break; }
            }
        }
        
        int rem=-1;
        int rp=-1;
        if (C[0]==3) { rp=0; rem=B[0]; }
        if (C[1]==3) { rp=1; rem=B[1]; }
        if (C[2]==3) { rp=2; rem=B[2]; }
        
        if (rem>-1) {
            ArrayList<Integer>L=new ArrayList();
            if (x!=rem) L.add(x);
            if (y!=rem) L.add(y);
            for (int i=2;i<5;i++) if (A[u+i]!=rem) L.add(A[u+i]);
            while (L.size()<2) L.add(rem);
            D[u][x][y]=1+dp(u+3,L.get(0),L.get(1));
        }
        else {
            int[]E=new int[5];
            E[0]=x;
            E[1]=y;
            for (int i=2;i<5;i++) E[i]=A[u+i];
            
            int r=0;
            for (int i=0;i<4;i++) {
                for (int j=i+1;j<5;j++) r=Math.max(r,dp(u+3,E[i],E[j]));
            }
            D[u][x][y]=r;
        }
        
        return D[u][x][y];
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}