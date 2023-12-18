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
	 
	    // int n=sc.nextInt();
	    int n;
	    char A[]=sc.nextString().toCharArray();
	    char B[]=sc.nextString().toCharArray();
	    int s=0,ss=0,ans=1<<28,st=0;
	    n=A.length;
	    int a[]=new int[n];
	    int b[]=new int[n];
	    for (int i=0; i<n; i++) {
			a[i] = A[i]-'0';
			b[i] = B[i]-'0';
			s+=a[i];
			ss+=b[i];
			if(b[i]>0)st=i;
		}

		if(ss==0 && s>0){ans=-1;}
		else{	
			int l[]=new int[n];
			int r[]=new int[n];
			for (int i=1; i<n; i++) {
				l[(st+i)%n] = b[(st+i)%n] == 1 ? 0 : l[(st+i-1)%n]+1;
				r[(st-i+n)%n] = b[(st-i+n)%n] == 1 ? 0 : r[(st-i+1+n)%n]+1;
			}
	    	PriorityQueue<P> que = new PriorityQueue<P>();
			for (int i=-n*2; i<=n*2; i++) {
				int c=0, e=0;
				for (int t=0; t<n; t++) {
					if(a[t]==b[(t+3*n+i)%n])continue;
					c++;
					if(i<0 && l[t]<=-i)continue;
					else if(i>=0 && r[t]<=i)continue;
					// db(t,l[t],r[t]);
					que.add(new P(l[t],r[t]));
				}
				if(que.size()>0){
					e=que.peek().x;
					int min=que.poll().y,len=que.size(),end=min;
					for (int t=0; t<len; t++) {
						e=min(e , min + que.peek().x);
						end=que.peek().y;
						min = max(min,que.poll().y);
						// db(e);
					}
					e=min(e , end);
					// db(e);
				}
				ans=min(ans,2*e+c+abs(i));
				// db(i,"c=",c,ans);
			}
		// db(l);
		// db(r);
		}


		out.println(ans);
	    out.flush();
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