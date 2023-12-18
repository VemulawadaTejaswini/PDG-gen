/*package whatever //do not write package name here */

/*package whatever //do not write package name here */

import java.util.LinkedList; 
import java.util.Queue;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
class pair{
    public int x;
    public int y;
    public pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int first(){
        return this.x;
    }
    public int second(){
        return this.y;
    }
}
public class Main 
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    public static void main (String[] args) {
        FastReader ob = new FastReader();
        int n = ob.nextInt();
        int m = ob.nextInt();
        boolean arr[][] = new boolean[n+1][m+1];
        int dx[]= new int[4];
        int dy[] = new int[4];
        dx[0]=1;dx[1]=-1;dx[2]=0;dx[3]=0;
        dy[0]=0;dy[1]=0;dy[2]=-1;dy[3]=1;
        int max=0;
        for (int i=1;i<=n ;i++ ) {
            String s = ob.next();
            for (int j=1;j<=m ;j++ ) {
                if(s.charAt(j-1)=='.'){
                    arr[i][j] = true;
                }
                else{
                    arr[i][j] = false;
                }
                
            }
        }
        for (int i=1;i<=n ;i++ ) {
            for (int j=1;j<=m ;j++ ){
                if(arr[i][j]){
                    int dist[][] = new int[n+1][m+1];
                    for (int i1=1;i1<=n ;i1++ ) {
                        for (int j1=1;j1<=m ;j1++ ) {
                            dist[i1][j1] = -1;
                        }
                    }
                    dist[i][j]=0;
                    pair p = new pair(i,j);
                    Queue<pair> q = new LinkedList<>();
                    q.add(p);
                    while(q.size()!=0){
                        int x = q.peek().first();
                        int y = q.peek().second();
                        q.poll();
                        
                        for (int dir=0;dir<4 ;dir++ ) {
                            int x1 = x+dx[dir];
                            int y1 = y+dy[dir];
                            
                            
                            if(x1<1 || y1<1 || x1>n || y1 >m || !arr[x1][y1]){
                                
                            }
                            else{
                                //System.out.println(x1+" "+y1);
                                //System.out.println(dx[dir]+" "+dy[dir]+" "+dir+"--");
                                if(dist[x1][y1]<0){
                                    dist[x1][y1]=1+dist[x][y];
                                    max=Math.max(max,dist[x1][y1]);
                                    pair p1 =  new pair(x1,y1);
                                    q.add(p1);
                                }
                                
                            }
                        }
                    }
                    
                
                }
            }
        }
        System.out.println(max);
       
        
    }
}