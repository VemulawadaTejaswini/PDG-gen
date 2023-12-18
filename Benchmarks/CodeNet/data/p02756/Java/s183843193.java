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

public class Main implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
    static long mod=1000000007;
    
    public static void main(String[] args) {        
        new Thread(null, new Main(), "", 200 * 1024 * 1024).start();        
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

//        int n=sc.nextInt();
        String s=sc.nextString();
        int q=sc.nextInt();
        LinkedList<Integer> l=new LinkedList<>();
        int d[]=new int[610000];
        int x=300000,lef=x-1,ri=x+1;
        d[x]=-1;
        int c=0;
        for (int i = 0; i < q; i++) {
        	if(sc.nextInt()==1) {
        		c++;
        	} else {
        		if((sc.nextInt()+c)%2==1)
        			d[lef--]=-'a'+sc.nextString().charAt(0);
//        			l.addFirst(-'a'+sc.nextString().charAt(0));
        		else
        			d[ri++]=-'a'+sc.nextString().charAt(0);
//        			l.addLast(-'a'+sc.nextString().charAt(0));
        	}
		}
        
        if(c%2==0)
	        for (int i = lef+1,t; i < ri; i++) {
	        	t=d[i];
				if(t==-1)out.print(s);
				else out.print((char)('a'+t));

			}
        else {
	        for (int i = ri-1,t; lef<i; i--) {
	        	t=d[i];
				if(t==-1)out.print(s);
				else out.print((char)('a'+t));
			}
		}
        
        out.println();
     	out.flush();
    }
    
    static void ret(String ans) {
    	System.out.println(ans);
    	System.exit(0);
    }

    static void ret(long ans) {
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
//	int x,y; double d;
//	P(int  x, int y, double d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}


class P implements Comparable<P>{
    int p,h,f; long m;
    P(int p,int h, int f, long m) {
    	this.p=p;
    	this.h=h;
    	this.f=f;
    	this.m=m;
    }

    public int compareTo(P p){
    	if(this.p==p.p) {
    		if(this.f==-1) return 1;
    		return -1;
    	}
        return this.p-p.p;
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
    public String nextString()
    {
        while( st==null || !st.hasMoreTokens() )
			try {
				st = new StringTokenizer(x.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return st.nextToken();
    }
    public int nextInt()
    {
        return Integer.parseInt(nextString());
    }
    public int[] nextIntArray(int size) {
        int r[] = new int[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextInt(); 
        }
        return r;
    }
    public long[] nextLongArray(int size) {
        long r[] = new long[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextLong(); 
        }
        return r;
    }
    public char[] getCharSet() {
        return this.nextString().toCharArray();
    }    
    public long nextLong()
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
