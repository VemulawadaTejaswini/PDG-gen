import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
 
public class Main{  
    static long mod=1000000007;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    // static int dx[]={1,-1,0,0,1,1,-1,-1};
    // static int dy[]={0,0,1,-1,1,-1,1,-1};
    // PriorityQueue<Integer> que = new PriorityQueue<Integer>(); 
    //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
public  static void main(String[] args)   throws Exception, IOException{
 
    
    Reader sc = new Reader(System.in);
    PrintWriter out=new PrintWriter(System.out);
    // int n = sc.nextInt() ;
    int h = sc.nextInt(),w = sc.nextInt();
    char bd[][]=new char[h][w];
    for (int i=0; i<h; i++) {
    	bd[i] = sc.nextString().toCharArray();
    }
    int min[][]=new int[h][w];
    for (int i=0; i<h; i++) {
    	fill(min[i],10000);
 	}
 	min[0][0]=0;
 	dfs(0,0,min,bd,0);
 	int a=0;
 	int ans=min[h-1][w-1];
    for (int i=0; i<h; i++) {
    	for (int t=0;t<w ;t++ ) {
    		if(bd[i][t]=='.')a++;
    	}
 	}

	out.println(ans==10000?-1:a-ans-1);
    out.flush();
}

static void dfs(int x,int y,int min[][],char bd[][],int n){
	for (int i=0,xx,yy; i<4; i++) {
		xx=x+dx[i];
		yy=y+dy[i];
		if(validpos(xx,yy,bd.length,bd[0].length) && min[xx][yy]>n+1 && bd[xx][yy]=='.'){
			min[xx][yy]=n+1;
			dfs(xx,yy,min,bd,n+1);
		}
	}
}
 
static void db(Object... os){
 
    System.err.println(Arrays.deepToString(os));
 
}
 
static boolean validpos(int x,int y,int r, int c){
    
    return x<r && 0<=x && y<c && 0<=y;
    
}
 
static boolean bit(long x,int k){
    // weather k-th bit (from right) be one or zero
    return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
}
 
}

class Pair {
    int d,g;
    Pair(int d, int g) {
        this.d=d;
        this.g=g;
    } 
}
 
 
class XY {
    int x,y,d;
    XY(int x, int y, int d) {
        this.x=x;
        this.y=y;
        this.d=d;
    } 
}
 
class P implements Comparable<P>{
    int x,y;
    P(int x, int y) {
        this.x=x;
        this.y=y;
    } 
      
    public int compareTo(P p){
        return -x + p.x;//des
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}