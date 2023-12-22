import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static class Node{
        int r, c, dist;

        public Node(int r, int c, int dist){
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }

    static boolean isValid(int x, int y, int n, int m){
        return !(x <= 0 || x > n || y <= 0 || y > m);
    }

    public static void process(int test_number)throws IOException
    {
        int h = ni(), w = ni(), c_h = ni(), c_w = ni(), d_h = ni(), d_w = ni(),
            nr = 0, nc = 0;

        char grid[][] = new char[h + 1][];
        for(int i = 1; i <= h; i++)
            grid[i] = (" "+nln()).toCharArray();

        Node arr[][] = new Node[h + 1][w + 1];
        for(int i = 1; i <= h; i++)
            for(int j = 1; j <= w; j++)
                arr[i][j] = new Node(i, j, oo); 

        arr[c_h][c_w].dist = 0;
        PriorityQueue<Node> q = new PriorityQueue<>((A, B) -> A.dist - B.dist);
        q.add(arr[c_h][c_w]);

        while(!q.isEmpty()){
            Node nn = q.poll();
            int r = nn.r, c = nn.c, dist = nn.dist;

            for(int i = 0; i < 4; i++){
                nr = r + x_coord[i];
                nc = c + y_coord[i]; 

                if(!isValid(nr, nc, h, w) || grid[nr][nc] == '#')
                    continue;

                if(dist < arr[nr][nc].dist){
                    arr[nr][nc].dist = dist;
                    if(q.contains(arr[nr][nc]))
                        q.remove(arr[nr][nc]);

                    q.add(arr[nr][nc]);  
                }
            }

            for(int i = -2; i <= 2; i++){
                for(int j = -2; j <= 2; j++){
                    if(Math.abs(i) + Math.abs(j) == 1)
                        continue;

                    nr = r + i;
                    nc = c + j;

                    //if(r == 2 && c == 2 && nr == 4 && nc == 4) trace(dist, arr[nr][nc].dist);
                    if(!isValid(nr, nc, h, w) || grid[nr][nc] == '#')
                        continue;

                    //if(r == 2 && c == 2 && nr == 4 && nc == 4) trace(dist, arr[nr][nc].dist);
                    if(dist + 1 < arr[nr][nc].dist){

                        arr[nr][nc].dist = dist + 1;
                        if(q.contains(arr[nr][nc]))
                            q.remove(arr[nr][nc]);

                        q.add(arr[nr][nc]);
                    }
                }
            }
        }

        int x = arr[d_h][d_w].dist;
        pn(x == oo ? -1 : x);
    }
     
    static int oo = 12345678, x_coord[] = {1, 0, -1, 0}, y_coord[] = {0, 1, 0, -1};
    static final long mod = (long)1e9+7l;
    
    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc = new FastReader();
 
        long s = System.currentTimeMillis();
        int t = 1;
        //t = ni();
        for(int i = 1; i <= t; i++)
            process(i);
 
        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
    }

    static void trace(Object... o){ System.err.println(Arrays.deepToString(o)); };
    static void pn(Object o){ out.println(o); }
    static void p(Object o){ out.print(o); }
    static int ni()throws IOException{ return Integer.parseInt(sc.next()); }
    static long nl()throws IOException{ return Long.parseLong(sc.next()); }
    static double nd()throws IOException{ return Double.parseDouble(sc.next()); }
    static String nln()throws IOException{ return sc.nextLine(); }
    static long gcd(long a, long b)throws IOException{ return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{ return (b==0)?a:gcd(b,a%b); }
    static int bit(long n)throws IOException{ return (n==0)?0:(1+bit(n&(n-1))); }
    
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
    } 
}
