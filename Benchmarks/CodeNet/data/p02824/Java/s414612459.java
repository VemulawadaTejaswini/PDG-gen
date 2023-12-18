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
  
    void solve() throws IOException {
        int n=ni();
        long m=nl(),v=nl();
        int p=ni();
        long pl=p;
        
        int[]A=new int[n+2];
        A[0]=-1;
        A[n+1]=Integer.MAX_VALUE;
        for (int x=1;x<=n;x++) A[x]=ni();
        Arrays.sort(A);
        
        long vl = m*(v-p);
        int ans=p;
        int b=n-p+1;
        int target=A[b];
        int a=b-1;
        long c=0;
        long ctotal=0;
        
        while (a>0) {
            if (A[a]+m<target) break;
            
            if (A[a]==A[a+1]) {
                ans++;
            }
            else {
                if (c*(A[a]+m)-ctotal+(a-1)*m>=vl) ans++;
                else break;
            }
            
            c++;
            ctotal+=A[a];
            a--;
            
        }
        
        
        System.out.println(ans);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}