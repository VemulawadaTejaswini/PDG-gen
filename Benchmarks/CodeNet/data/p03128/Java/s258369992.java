import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
    static long mem[];

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
        	if(e==1)d[2]=12;
        	if(e==7)d[3]=73;
        	if(e==4)d[4]=44;
        	if(e==2||e==3||e==5)d[5]=max(d[5],e*10+5);
        	if(e==6|| e==9)d[6]=max(d[6],e*10+6);
        	if(e==8)d[7]=87;
		}
        sort(d);
        
        
        mem = new long[n+1];
        rep(d,n);
        long v=1<<9;v--;
        int x[]=new int[n],c=0;

        for (int i = 5; -1 < i; i--) {
        	long w=(mem[n]>>(9*i))&v;
        	int t=0;
        	for (int j = 0; j < 10; j++) {
				if(d[j]%10==i+2) {t=d[j]/10;break;}
			}
        	while ( w-->0 ) {
        		x[c++]=t;
        	}
		}
        sort(x);
        for (int i = 0; i < x.length; i++) {
			if(x[n-i-1]>0)out.print(x[n-i-1]);
		}

        out.println();
        out.flush();
    }
    
    static long rep(int d[],int n) {
    	if(mem[n]>0) return mem[n];
    	if(n==0)return 0;
    	long r=-1;
    	for (int i = 9; 1 <= i; i--) {
			if(d[i]>0 && n-d[i]%10>=0) {				
				long e=rep(d,n-d[i]%10);				
				if(e>=0) {
					r=max(r,e+(1L<<54) + (1L<<(9*(d[i]%10-2)) ) );
				}
			}
		}
    	if(r<0)return r;
    	mem[n]=max(mem[n],r);
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
