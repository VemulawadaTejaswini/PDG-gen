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

//        int n=sc.nextInt();
        int d[][]= new int[4][4];
        for (int i = 0; i < 3; i++) {
    		int a=sc.nextInt()-1;
    		int b=sc.nextInt()-1;
    		d[a][b]=d[b][a]=1;
    	}
        String ans = "NO";
        
loop:
        for (int i = 0; i < 4; i++) {
        	int e[]=new int[4];
			for (int j = 0; j < 4; j++) {
				for (int w = 0; w < 4; w++) {
					for (int v = 0; v < 4; v++) {
						if(func(i,j,w,v) && d[i][j]>0 && d[w][j]>0 && d[w][v]>0 )
						{
							ans="YES";break loop;
						}
					}
				}
			}
		}

        out.println(ans);
        out.flush();
    }

    static boolean func(int a,int b,int c,int e) {
    	int d[]=new int[4];
    	d[a]++;
    	d[b]++;
    	d[c]++;
    	d[e]++;
    	sort(d);
    	if(d[0]==1 && d[3]==1)return true;
    	return false;
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
