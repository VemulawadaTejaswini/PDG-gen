import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static class Pair{
        int r, c;
        public Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    static boolean isValid(int x, int y, int n, int m){
        return !(x <= 0 || x > n || y <= 0 || y > m);
    }

    public static void process(int test_number)throws IOException
    {
        int h = ni(), w = ni(), c_h = ni(), c_w = ni(), d_h = ni(), d_w = ni(), nr = 0, nc = 0;
        char arr[][] = new char[h + 1][w + 1];
        boolean visited[][] = new boolean[h + 1][w + 1];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 1; i <= h; i++)
            arr[i] = (" "+nln()).toCharArray();

        long dp[][] = new long[h + 1][w + 1];
        for(long row[] : dp)
            Arrays.fill(row, oo);

        dp[c_h][c_w] = 0;
        visited[c_h][c_w] = true;
        q.add(new Pair(c_h, c_w));

        while(!q.isEmpty()){
            Pair pp = q.poll();
            int r = pp.r, c = pp.c; //trace(r, c);
            
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++){
                    nr = r + x_coord[i];
                    nc = c + y_coord[i];

                    if(!isValid(nr, nc, h, w) || arr[nr][nc] == '#')
                        continue;

                    if(visited[nr][nc])
                        dp[nr][nc] = Math.min(dp[nr][nc], dp[r][c]);
                    else{
                        visited[nr][nc] = true;
                        dp[nr][nc] = dp[r][c];
                        q.add(new Pair(nr, nc));
                    }
                }
    
            for(int i = -2; i <= 2; i++){
                for(int j = -2; j <= 2; j++){
                    
                    if(i == 0 && j == 0)
                        continue;

                    nr = r + i;
                    nc = c + j;

                    if(!isValid(nr, nc, h, w) || arr[nr][nc] == '#')
                        continue;

                    if(visited[nr][nc])
                        dp[nr][nc] = Math.min(dp[nr][nc], 1 + dp[r][c]);
                    else{
                        visited[nr][nc] = true;
                        dp[nr][nc] = 1 + dp[r][c]; 
                        q.add(new Pair(nr, nc));
                    }
                }
            }

            //for(int row[] : dp) trace(row);
        }

        pn((dp[d_h][d_w] == oo || dp[d_h][d_w] > h * w) ? -1 : dp[d_h][d_w]);
    }
    
    static int x_coord[] =  { 1, 0, -1, 0 }, y_coord[] = { 0, 1, 0, -1 };
    static long oo =  987654321l;
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
