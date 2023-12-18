import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        
        int n=sc.nextInt(),c=0;
        long a[]=new long[n];
        for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        HashMap<Long, Integer> id = new HashMap<Long, Integer>();
        ArrayList<Long> lis = new ArrayList<Long>();
        sort(a);
  
        for (int i = a.length-1; 0<=i; i--) {
        	if(map.containsKey(a[i])) {
        		int k=map.get(a[i])+1;
        		map.put(a[i], k);
        	}
        	else {
            	lis.add(a[i]);
        		map.put(a[i],1);
        		id.put(a[i],c++);
        	}
		}
        
        int ans=0;

        for(int i = 0; i < lis.size() ; i++) {
        	long A=lis.get(i);
        	int r=map.get(A);
//        	db(A,r,ans);
        	if(r==0)continue;
        	long b=1L<<32;
        	while(b/2>A) {
        		b/=2;
        		long p=b-A;
        		if(map.containsKey(p)) {
        			int k=map.get(p);
        			if(k<1)continue;
        			if(p==A && k<2)continue;
        			ans++;
        			r--;
        			if(A==p) {
            			map.put(A, r-1);
        			}
        			else {
	        			map.put(A, r);
	        			k--;
	        			map.put(p, k);
        			}
        			if(r>0)i--;
        			break;
        		}
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


//class P implements Comparable<P>{
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//    public int compareTo(P p){
//        return d-p.d; //des
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
