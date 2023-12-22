import java.util.*;
import java.io.*;

public class Main
{
    static class Reader {
		BufferedReader br;
		StringTokenizer st;
 
		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
 
	}
    static class Ele implements Comparable<Ele> 
    {  
        public int x,y;  
        Ele(int x,int y) 
        {  
            this.x=x;this.y=y; 
        }  
        public int compareTo(Ele ob) {  
        if(ob.x!=x)return x-ob.x;
        return this.y-ob.y;  
        }   
    }
    int a[][];int b[][];
    
    long gcd(long a,long b)
    {
        long min=Math.min(a,b);
        long max=Math.max(a,b);
        while (max%min!=0)
        {
            a=max%min;
            max=min;min=a;
        }
        return min;
    }
	public static void main(String[] args) throws IOException 
	{
		Reader sc=new Reader();//Solution G=new Solution();
		PrintWriter o = new PrintWriter(System.out);
		int t=1;
		//int t=sc.nextInt();
		
		int n,m,y0,x0,y1,x1,x2,y2,s0,s2;long a[],b[],in[],in1[];
		long k,s,l;boolean b1[],b2;String s1[],ss;int mod=(int)1e9+7;
		//long l;long a[]; 
		ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		ArrayList<Integer> a3=new ArrayList<>();
		ArrayDeque<Integer> deq=new ArrayDeque<>();
		TreeSet<Integer> h0=new TreeSet<>();
		TreeSet<Integer> h1=new TreeSet<>();
		HashMap<Integer,Integer> h=new HashMap<>();
		try{
		while (t-->0)
		{
		    n=sc.nextInt();a=new long[n];k=0;l=0;s=0;b=new long[n];
		    for (int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for (int i=0;i<n;i++)
		    {
		        b[n-i-1]=s;
		        s=(s+a[n-i-1])%mod;
		    }
		    //o.println(Arrays.toString(a)+" "+Arrays.toString(b));
		    for (int i=0;i<n;i++)
		    {
		        k=(a[i]*b[i])%mod;
		        l=(l+k)%mod;
		        
		    }
		    o.println(l);
		    //o.println();
		    //o.println();
		    //o.println(h);
		    //o.println(x2);
		    //o.println();
		    h0.clear();ll.clear();a1.clear();a2.clear();h1.clear();
		}
		}
		catch (Throwable e)
		{
		    e.printStackTrace();
		}
		//o.println("HI");
		
        o.flush();
        o.close();
	}
} 