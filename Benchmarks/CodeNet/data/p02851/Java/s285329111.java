import java.util.*;
import java.util.Map.Entry;

import javax.swing.text.Segment;
import javax.xml.ws.WebEndpoint;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main //implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
	static double s;
	
    public static void main(String[] args)   throws Exception, IOException{        
//        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=sc.nextIntArray(n);
        int d[]=new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> l=new LinkedList<>();
        long ans=0;
        for (int i = 0; i < d.length; i++) {
        	a[i]%=k;
			if(i>0) {a[i]+=a[i-1];a[i]%=k;}
        	if((i+1)==a[i])ans++;
		}
        
//        map.put(1, 1);
//        l.addFirst(1);
        for (int i = 0,t,md,c,v; i < d.length; i++) {
			t=i%k;
			md=(a[i]-t)%k;
			md+=k;md%=k;
			if(map.containsKey(md)) {
				c=map.get(md);
				ans+=c;
				map.put(md, c+1);
			} else {
				map.put(md, 1);				
			}
			if(l.size()==k-2) {
				v=l.pollLast();
				c=map.get(v);
				map.put(v, c-1);
			} 
			l.addFirst(md);
//			db(t,md,ans);
		}
//        db(a);

        out.println(ans);
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

//
//class P {
//	int x, y, d;
//	P(int  x, int y, int d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
        return -p.a+a;//as
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
