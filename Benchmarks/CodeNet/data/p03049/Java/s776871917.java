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

        int n = sc.nextInt();
        int a=0,b=0,c=0,x=0;
        for (int i = 0; i < n; i++) {
			char s[]=sc.nextString().toCharArray();
			for (int t = 0; t+1 < s.length; t++) {
				if(s[t]=='A' && s[t+1]=='B')c++;
			}

			if(s[0]=='B' && s[s.length-1]=='A') {
				x++;continue;
			}

			if(s[0]=='B')b++;
			if(s[s.length-1]=='A')a++;
		}
//        db(a,b,x,c);
        for (int i = 0; i < x; i++) {
        	if(a==b)break;
			if(a<b)a++;
			else b++;
			x--;
		}
            
        out.println(c+min(a,b)+x);
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
//    int id,T;
//    P(int id, int T) {
//        this.id=id;
//        this.T=T;
//    }
//    public int compareTo(P p){
//        return id-p.id; //des
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
