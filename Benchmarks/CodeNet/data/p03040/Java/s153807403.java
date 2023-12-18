import java.util.*;
import java.util.Map.Entry;

import javax.swing.text.Segment;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main //implements Runnable
{
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int q[][] = new int[3][n];
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        for (int i = 0; i < n; i++) {
			q[0][i]=sc.nextInt();
			if(q[0][i]==1) {
				q[1][i]=sc.nextInt();
				q[2][i]=sc.nextInt();
				l.add(q[1][i]);
			}
		}
        sort(l);
        for (int i = 0, c=0; i < l.size(); i++) {
        	int x=l.get(i);
			if(!mp.containsKey(x)) {
				mp.put(x, ++c);
			}
		}

        bit app=new bit(n);
        bit sum=new bit(n);
        long bs=0;

        for (int i = 0,c=0,md,mn,v; i < n; i++) {
			if(q[0][i]==2) {
				md=app.lb(c%2==0?c/2:c/2+1);
			    int left=md-1;
			    long val=l.get(md-1), ms=app.sum(md),msl=app.sum(md-1)
			    		,msr=app.sum(n)-ms;
//			    db("s",md,bs,msl,msr,val);
			    out.println(val+" "+(
			    		msl*val-sum.sum(md-1)-msr*val+sum.sum(n)
			    		-sum.sum(md)+bs));

			} else {
				c++;
				mn=mp.get(q[1][i]);
				bs+=q[2][i];
				app.add(mn, 1);
				sum.add(mn, q[1][i]);
			}
		}
        
        out.println();
     	out.flush();
    }

    static void ret(String ans) {
    	System.out.println(ans);
    	System.exit(0);
    }
    
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
}

//class P {
//	int x, y;
//	P(int  x, int y) {
//	  this.x=x;
//	  this.y=y;
//	}
//}
class bit {
    int n;
    long b[]; 
    bit(int n){
        this.n = n;
        b = new long[n+1];
    }
    long sum(int i){
        long s = 0;
        while(i > 0){
            s += b[i];
            i -= i&-i;
        }
        return s;   
    }
    void add(int i, int x){
        while(i <= n){
            b[i] += x;
            i += i&-i;
        }
    }
    
    int lb(long x) {
    	//lower bound sum(i)がx以上となるような最小のi
    	int dw=1,up=n,md,min=n+1;
    	for (int i = 0; i < 60; i++) {
			md=(dw+up)/2;
			if(x<=sum(md)) {
				min=min(min,md);
				up=md;
			} else {
				dw=md;
			}
		}
    	if(min==n+1)return -1;
    	return min;
    }
}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
        return p.a-a;//des
    }
}

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
    public char[] getCharSet() throws IOException{
        return this.nextString().toCharArray();
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
