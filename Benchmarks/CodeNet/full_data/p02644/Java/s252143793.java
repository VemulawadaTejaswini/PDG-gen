import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int[]dx={0,0,1,-1},dy={1,-1,0,0};
    static int n,m;
    static char[][]g;
    static boolean valid(int x,int y){
        return x<n&&y<m&&x>=0&&y>=0&&g[x][y]=='.';
    }
    public  static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        int k = sc.nextInt();
        int[]s = new int[2];
        s[0]=sc.nextInt()-1;s[1]=sc.nextInt()-1;
        int[]e = new int[2];
        e[0]=sc.nextInt()-1;e[1]=sc.nextInt()-1;
        g = new char[n][m];
        for (int i =0;i<n;i++)
            g[i]=sc.nextLine().toCharArray();

        int[][]dis = new int[n][m];
        for (int[]x:dis)Arrays.fill(x,(int)1e9);
        dis[e[0]][e[1]]=0;
        Queue<int[]>q = new LinkedList<>();
        ((LinkedList<int[]>) q).add(new int[]{e[0],e[1],k,0});
        while (!q.isEmpty()){
            Queue<int[]>nxt = new LinkedList<>();
            while (!q.isEmpty()){
                int[] cur = q.poll();
                for (int j=0;j<4;j++){
                    int x = cur[0]+dx[j];
                    int y = cur[1]+dy[j];
                    int d = dis[cur[0]][cur[1]]+(j==cur[3]&&cur[2]<k?0:1);
                    if (valid(x,y)){
                        if (d<dis[x][y]){
                            if (d==dis[cur[0]][cur[1]]){
                                dis[x][y]=d;
                                ((LinkedList<int[]>) q).add(new int[]{x,y,cur[2]+1,j});
                            }
                            else{
                                dis[x][y]=d;
                                ((LinkedList<int[]>) nxt).add(new int[]{x,y,1,j});
                            }
                        }
                    }
                }
            }
            q=nxt;
        }
        if (dis[s[0]][s[1]]==1e9){
            pw.println(-1);
        }
        else pw.println(dis[s[0]][s[1]]);
        pw.flush();
    }
    static class Scanner
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException
        {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if(x.charAt(0) == '-')
            {
                neg = true;
                start++;
            }
            for(int i = start; i < x.length(); i++)
                if(x.charAt(i) == '.')
                {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                }
                else
                {
                    sb.append(x.charAt(i));
                    if(dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg?-1:1);
        }

        public boolean ready() throws IOException {return br.ready();}


    }
}