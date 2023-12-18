import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.rmi.server.UnicastRemoteObject;

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

        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int e[][]=new int[m][3];
        ArrayList<Integer> lx[]=new ArrayList[n];
        ArrayList<Integer> ly[]=new ArrayList[n];
        
        for (int i = 0; i < lx.length; i++) {
			lx[i]=new ArrayList<>();
			ly[i]=new ArrayList<>();
		}
        
        for (int i = 0; i < e.length; i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			int c=sc.nextInt();
			e[i][0]=a;
			e[i][1]=b;
			e[i][2]=-c+p;
			lx[a].add(b);
			lx[b].add(a);
        }
        
        long cs[]=new long[n];
        fill(cs, 1L<<50);
        cs[0]=0;
        
        for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < e.length; j++) {
				int fr=e[j][0];
				int to=e[j][1];
				int ex=e[j][2];
				if(cs[to]>cs[fr]+ex) {
					cs[to]=cs[fr]+ex;
//					db(fr,to,cs[to]);
				}
			}
		}
        
        boolean st[]=new boolean[n];
        boolean go[]=new boolean[n];
        LinkedList<Integer> q = new LinkedList<>();
        
        q.add(0);
        st[0]=true;
        while(!q.isEmpty()) {
        	int x=q.poll();
        	for (int i = 0; i < lx[x].size(); i++) {
				int to=lx[x].get(i);
				if(!st[to]) {
					st[to]=true;
					q.add(to);
				}
			}
        }

        q.add(n-1);
        go[n-1]=true;
        while(!q.isEmpty()) {
        	int x=q.poll();
        	for (int i = 0; i < ly[x].size(); i++) {
				int to=ly[x].get(i);
				if(!go[to]) {
					go[to]=true;
					q.add(to);
				}
			}
        }
        
        long ans=max(0,-cs[n-1]);
        for (int i = 0; i < e.length; i++) {
			int fr=e[i][0];
			int to=e[i][1];
			int ex=e[i][2];
			if(cs[to]>cs[fr]+ex && st[fr] && go[fr]) {
				ans=-1;
				break;
			}
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
//	int x, y;
//	P(int  x, int y) {
//	  this.x=x;
//	  this.y=y;
//	}
//}


//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
    	if(a==p.a) return b-p.b;
        return -p.a+a;
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
