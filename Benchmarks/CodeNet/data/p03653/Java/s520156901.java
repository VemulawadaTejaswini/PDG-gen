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

        // int n=sc.nextInt();
        long ans=0;
        PriorityQueue<Pair> que = new PriorityQueue<Pair>();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int yy=y,zz=z;
        int n=x+y+z;
        int d[][]=new int[3][n];
        
        for( int i=0; i<n; i++){
            d[0][i]=sc.nextInt();
            d[1][i]=sc.nextInt();
            d[2][i]=sc.nextInt();
            ans+=d[0][i];
            que.add(new Pair(d[1][i]-d[0][i],1,i));
            que.add(new Pair(d[2][i]-d[0][i],2,i));
        }
        int r[]=new int[y+z],c=0;
        boolean u[]=new boolean[n];
        while(!que.isEmpty()){
            Pair p=que.poll();
            if (u[p.id]) {
                continue;
            }
            if(p.y==1){
                yy--;
                if(yy<0)continue;
            }
            else {
                zz--;
                if(zz<0)continue;
            }
            u[p.id]=true;
            r[c++]=p.id;
        }
        int rz[]=new int[z];
        c=0;        
        que.clear();
        for( int i=0; i<y+z; i++ ){
            que.add(new Pair(-d[1][r[i]]+d[2][r[i]],2 ,r[i]));
        }
        for( int i=0; i<z; i++ ){
            rz[c++]=que.poll().id;
        }
        for( int i=0; i<y+z; i++ ){
            ans+=d[1][r[i]]-d[0][r[i]];
        }
        for( int i=0; i<z; i++ ){
            ans+=d[2][rz[i]]-d[1][rz[i]];
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

class Pair implements Comparable<Pair>{
    int x,y,id;
    Pair(int x, int y,int id) {
        this.x=x;
        this.y=y;
        this.id=id;
    } 
    public int compareTo(Pair p){
        return p.x -     x;
    } 
}

// class Pair implements Comparable<Pair>{
//     int x,y;
//     Pair(int x, int y) {
//         this.x=x;
//         this.y=y;
//     } 
//     public int compareTo(Pair p){//descend
//         return p.x - x;
//     } 

// }

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