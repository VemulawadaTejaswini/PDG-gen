import java.util.*;
import java.io.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
    static long mod=1000000007;
    // static int dx[]={1,-1,0,0};
    // static int dy[]={0,0,1,-1};
    // static int dx[]={1,-1,0,0,1,1,-1,-1};
    // static int dy[]={0,0,1,-1,1,-1,1,-1};
    // PriorityQueue<Integer> que = new PriorityQueue<Integer>(); 
    //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    //ArrayList<Integer> lis = new ArrayList<Integer>();
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int d[]=new int[n];
        int g[]=new int[n];
        int f[][]=new int[n-1][2];
        int e[][]=new int[n][];
        int pre[]=new int[n];
        String ans="Snuke";
        if(n==2){
            out.println(ans);       
            out.flush();
            return;
        }
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(); 
        for( int i=0; i<n-1; i++ ){
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            g[x]++;g[y]++;
            f[i][0]=x;
            f[i][1]=y;
        }
        for( int i=0; i<n; i++ ){
            e[i]=new int[g[i]];
            g[i]=0;
        }

        for( int i=0,fr,to; i<n-1; i++ ){
            fr=f[i][0];
            to=f[i][1];
            e[fr][g[fr]++]=to;
            e[to][g[to]++]=fr;
        }
        boolean us[]=new boolean[n];
        que.add(0);
        us[0]=true;
        fill(pre,-1);
        while(!que.isEmpty()){
            int q=que.poll();
            for( int i=0,t; i<g[q]; i++ ){
                t=e[q][i];
                if(!us[t]){pre[t]=q; que.add(t); us[t]=true;}
            }
        }

        int l=0,cr=n-1,s=0,st=n-1;
        while(true){
            if(pre[cr]==0)break;
            l++;
            cr=pre[cr];
        }
        cr=n-1;
        for( int i=0; i<l/2; i++ ){
            st=pre[cr];
            cr=pre[cr];
        }

        que.clear();
        que.add(st);
        fill(us,false   );
        us[st]=true;
        us[pre[st]]=true;

        while(!que.isEmpty()){
            int q=que.poll();
            s++;
            for( int i=0,t; i<g[q]; i++ ){
                t=e[q][i];
                if(!us[t]){pre[t]=q; que.add(t); us[t]=true;}
            }
        }

        // db(pre,l,s);
        if(n-s > s)ans="Fennec";
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

class Pair implements Comparable<Pair>{
    int x,y;
    Pair(int x, int y) {
        this.x=x;
        this.y=y;
    } 
    public int compareTo(Pair p){//descend
        return p.x - x;
    } 

}

class P implements Comparable<P>{
    int diff,id1,id2;
    P(int diff, int id1,int id2) {
        this.diff=diff;
        this.id1=id1;
        this.id2=id2;
    } 
      
    public int compareTo(P p){//ascend
        return diff - p.diff;
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