import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int d[][]=new int[m][];
        int p[]=new int[m];
        for (int i = 0; i < d.length; i++) {
        	int k=sc.nextInt();
        	d[i]=new int[k];
        	for (int j = 0; j < k; j++) {
				d[i][j]=sc.nextInt()-1;
			}
		}
        for (int i = 0; i < p.length; i++) {
			p[i]=sc.nextInt();
		}
        int ans=0;
        for (int i = 0; i < 1<<n; i++) {
			int s=i,e=0;
			for (int t = 0; t < m; t++) {
				int c=0;
				for (int j = 0; j < d[t].length; j++) {
					if( (s>>d[t][j])%2==1)c++;
				}
				if(c%2==p[t])e++;
				else break;
			}
			if(e==m)ans++;
		}
        
        out.println(ans);
        out.flush();
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
//	int v,id;
//	String s;
//	P(int id, int v, String s) {
//	  this.id=id;
//	  this.v=v;
//	  this.s=s;
//	}
//	public int compareTo(P p){			
//	 if(s.equals(p.s)) {
//		 return -v+p.v;
//	 }
//	  return s.compareTo(p.s);
//	}
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
