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

    public static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int d = sc.nextInt()-1;
        char s[] = sc.nextString().toCharArray();
        if(c>d) {
        	int tmp=d;
        	d=c;
        	c=tmp;
        	tmp=b;
        	b=a;
        	a=tmp;
        }
        
        if(c<d) {
        	int B=0,w=0;
        	for (int i = b+1; i+1 < d; i++) {
				if(s[i]=='#' && s[i+1]=='#') {B--;}
				if(B<0) {
			        out.println("No");
			        out.flush();
			        return;
				}				
			}
        	if(b<a && a<=d) {
        		while(a<=d) {
        			if(a==d) {
    			        out.println("No");
    			        out.flush();
    			        return;
    			    }
        			else if(s[a-1]=='#')a++;
        			else if(s[a+1]=='#') {
        				a+=2;
        			}
        			else break;
        		}
		        out.println("Yes");
		        out.flush();
		        return;
        	}
        	int A=0;
        	for (int i = a+1; i+1 < c; i++) {
				if(s[i]=='#' && s[i+1]=='#') {A--;}
				if(A<0) {
			        out.println("No");
			        out.flush();
			        return;
				}
			}        	
        }
        
        out.println("Yes");
        out.flush();
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
//	int x,w,id,ox;
//	P(int id, int x, int w) {
//		this.id=id;
//		this.x=x;
//		this.w=w;
//	}
//
//	public int compareTo(P p){
//		if(x==p.x) {
//			return w-p.w;
//		}
//		return x-p.x;
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
