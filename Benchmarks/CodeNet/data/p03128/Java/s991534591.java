import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        int m=sc.nextInt();
        int d[]=new int[10];

        for (int i = 0; i < m; i++) {
        	int e=sc.nextInt();
        	if(e==1)d[2]=1;
        	if(e==7)d[3]=7;
        	if(e==4)d[4]=4;
        	if(e==2||e==3||e==5)d[5]=max(d[5],e);
        	if(e==6|| e==9)d[6]=max(d[6],e);
        	if(e==8)d[7]=8;
		}
        
        int x[]=new int[10];
        rep(d,x,n,2);
//        db(d);
//        db(x);
        int r[]=new int[n+1],c=0;
        for (int i = 2; i < x.length; i++) {
			while(x[i]-->0) {
		        r[c++]=d[i];
			}
		}
        sort(r);
        for (int i = r.length-1; -1 < i; i--) {
			if(r[i]==0)break;
			out.print(r[i]);
		}
        out.println();
        out.flush();
    }
    
    static int[] rep(int d[], int x[], int n,int w) {
    	if(n==0) return x;
    	int r[]=null;
    	for (int i = 2; i <= 7; i++) {
			if(d[i]>0 && n-i>=0) {
				x[i]++;
				r = rep(d,x,n-i,i);				
		    	if(r!=null)return r;
		    	x[i]--;
			}
		}
    	return r;
    }
    
    static long gcd(long a, long b){
        if(min(a,b) == 0)return max(a,b);
        return gcd(max(a,b) % min(a,b),min(a,b));
    }
    
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  
}

//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

//class P implements Comparable<P>{
//    int a,b;
//    P(int a, int b) {
//        this.a=a;
//        this.b=b;
//    }
//    public int compareTo(P p){
//        return b-p.b; //des
//    }
//}

class Reader
{ 
    private BufferedReader x;
    private StringTokenizer st;
    
    public Reader(InputStream in)
    {
        x = new BufferedReader(new InputStreamReader(in));
        st = null;
    }
    public String nextString() throws IOException
    {
        while( st==null || !st.hasMoreTokens() )
            st = new StringTokenizer(x.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(nextString());
    }
    public int[] nextIntArray(int size) throws IOException{
    	int r[] = new int[size];
    	for (int i = 0; i < size; i++) {
			r[i] = this.nextInt(); 
		}
    	return r;
    }
    public long[] nextLongArray(int size) throws IOException{
    	long r[] = new long[size];
    	for (int i = 0; i < size; i++) {
			r[i] = this.nextLong(); 
		}
    	return r;
    }
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
