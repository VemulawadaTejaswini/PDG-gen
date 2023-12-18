import java.util.*;
import java.io.*;
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

        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        ArrayList<Integer>[] l=new ArrayList[n];
        for (int i = 0; i < l.length; i++) {
			l[i]=new ArrayList<>();
		}
        int sf=10,bt=(1<<sf)-1;
        int e[][]=new int[m][2];
        int ex[][]=new int[n][2];
        for (int i = 0; i < m; i++) {
			int f=sc.nextInt()-1,t=sc.nextInt()-1;
			l[f].add((t<<sf)+i);
			l[t].add((f<<sf)+i);
			e[i][0]=sc.nextInt();
			e[i][1]=sc.nextInt();
		}
        for (int i = 0; i < ex.length; i++) {
			ex[i][0]=sc.nextInt();
			ex[i][1]=sc.nextInt();
		}
        
        long d[][]=new long[50][3000];
        for (int i = 0; i < d.length; i++) {
			fill(d[i], 1L<<50);
		}
        
        PriorityQueue<P> q=new PriorityQueue<>();
        d[0][s]=0;
        q.add(new P(0,s,0));

        while(!q.isEmpty()) {
        	P p=q.poll();
//        	db(p.x,p.c,p.s);
        	if(p.s>d[p.x][p.c])continue;
			if(p.c+ex[p.x][0]<=2500 && p.s+ex[p.x][1] < d[p.x][p.c+ex[p.x][0]]) {
				d[p.x][ex[p.x][0]] = p.s + ex[p.x][1];
				q.add(new P(p.x, p.c + ex[p.x][0], p.s + ex[p.x][1]));
			}
			for (int i = 0,to,id; i < l[p.x].size(); i++) {
				id = l[p.x].get(i);
				to=id>>sf;
				id=id&bt;
				if(p.c < e[id][0])continue;
				if(p.s + e[id][1] < d[to][p.c-e[id][0]]) {
					d[to][p.c-e[id][0]] = p.s + e[id][1];
					q.add(new P(to, p.c - e[id][0], p.s + e[id][1]));
				}
			}
        }
        for (int i = 1; i < n; i++) {
        	sort(d[i]);
			out.println(d[i][0]);
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
//	int x,c;long s;
//	P(int  x, int c, long s) {
//	  this.x=x;
//	  this.c=c;
//	  this.s=s;
//	}
//}


class P implements Comparable<P>{
	int x,c;long s;
	P(int  x, int c, long s) {
	  this.x=x;
	  this.c=c;
	  this.s=s;
	}

    public int compareTo(P p){
        return Long.signum(s-p.s);
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
