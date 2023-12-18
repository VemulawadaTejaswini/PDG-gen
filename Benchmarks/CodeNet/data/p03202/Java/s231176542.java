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


        int n=sc.nextInt();
        int a[]=sc.nextIntArray(n);
        		        
        int up=n+1,dw=0,md,ans=n+1;
        ArrayDeque<P> dq=new ArrayDeque<P>();
        lp:
        while(up-dw>1) {
            int pos[]=new int[n+1];
            int num[]=new int[n+1];
            int pre=-1,p=0,l=a[0];
            pos[0]=1<<29;
            num[p]=1;
        	md=(up+dw)/2;
//        	db(up,dw,md);5 4 4 2 1 1
        	for (int i = 1; i < n; i++) {
//        		db(i,p,pos);
  //      		db(i,p,num,md);
        		if(l<a[i]) {l=a[i];continue;}
				while(0<=p&&a[i]<pos[p]) {
					p--;
				}
				if(0<=p && pos[p]==a[i]) {
	//				db("fit",pos,num,i);
					if(md<num[p]+1) {
						boolean f=true;
						while(md<=num[p]+1) {
							if(p==0) {
								if(pos[p]==1) f=false;
								pos[p]--;
								break;
							}
							if(pos[p]-pos[p-1]>2) {pos[p]--;break;}
							p--;
						}
						if(!f) {dw=md; continue lp;	}		
						num[p]++;
					}
					else {
						num[p]++;
					}
				}
				else {
					if(p<0)p++;
					if(md<=1) {dw=md;continue lp;}
					num[p]=2;						
					pos[p]=a[i];
				}
				l=a[i];
			}
        	up=md;
        	ans=min(ans,md);
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

class P {
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
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
