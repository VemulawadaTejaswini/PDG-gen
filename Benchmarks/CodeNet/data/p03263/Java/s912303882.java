import java.util.*;
import java.io.*;
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        int m=sc.nextInt(), odd=0;
        int d[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for (int t=0; t<m; t++) {
                d[i][t]=sc.nextInt();
                if(d[i][t]%2==1)odd++;
            }
        }
        int ody=-1,odx=-1,c=0;
        int ans[][] = new int[n*m][4];

        for(int i=0; i<n; i++) {
            if(i%2==0)for (int t=0; t<m; t++) {
                if(0<=ody){
                    ans[c][0]=ody+1;
                    ans[c][1]=odx+1;
                    ans[c][2]=i+1;
                    ans[c++][3]=t+1;
                    ody=i;odx=t;
                }
                if(d[i][t]%2==1){
                    if(ody<0){ody=i;odx=t;}
                    else{ 
                        ody=-1;odx=-1;
                        odd-=2;
                    }
                }
            }
            else for (int t=m-1; -1<t; t--) {
                if(0<=ody){
                    ans[c][0]=ody+1;
                    ans[c][1]=odx+1;
                    ans[c][2]=i+1;
                    ans[c++][3]=t+1;
                    ody=i;odx=t;
                }
                if(d[i][t]%2==1){
                    if(ody<0){ody=i;odx=t;}
                    else{ 
                        ody=-1;odx=-1;
                        odd-=2;
                    }
                }
            }
            if(odd<2)break;
        }
        out.println(c);   
        for(int i=0; i<c; i++) {
            out.println(ans[i][0]+" "+ans[i][1]+" "+ans[i][2]+" "+ans[i][3]);   
        }
        // out.println(ans);
        out.flush();
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  
}

class P implements Comparable<P>{
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
    public int compareTo(P p){
        return d-p.d; //des
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
