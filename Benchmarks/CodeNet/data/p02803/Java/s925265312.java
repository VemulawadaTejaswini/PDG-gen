//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static String file = "../in";

    public static void main(String[] args) throws Exception
    {
        int test = 10,   // 0 for local testing, 1 for std input
            _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");}

        new Main().d();

    }

    void d() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int h = Integer.valueOf(sp[0]),
            w = Integer.valueOf(sp[1]);
        char[][] board = new char[h][];
        for(int i = 0; i < h; i++)
        {
            board[i] = in.readLine().toCharArray();
        }
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if(board[i][j] == '.')
                    list.add(new int[]{i, j});
            }
        }

        int size = list.size();
        int dist = 0;
        for (int i = 0; i < size; i++) 
        {
            int tmp = bfs(board, list.get(i));
            // System.out.printf("%s %d\n", Arrays.toString(list.get(i)), tmp);
            dist = Math.max(dist, tmp);
        }

        System.out.println(dist);
    }
    
    int bfs(char[][] b, int[] start)
    {
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        int[] dx = {0, 1, 0, -1}, 
                dy = {1, 0, -1, 0};
        int step = 0;
        int maxd = 0;
        int m = b.length, n = b[0].length;
        int[][] bb = new int[m][n];

        for(int[] brow : bb) Arrays.fill(brow, 410);

        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- > 0)
            {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];
                if(bb[x][y] <= step) continue;
                bb[x][y] = step;
                maxd = Math.max(maxd, step);
                for(int k = 0; k < 4; k++)
                {
                    int nx = x + dx[k],
                        ny = y + dy[k];
                    if(nx < 0 || ny < 0 || nx >= m || ny >= n || b[nx][ny] == '#') continue;
                    q.offer(new int[]{nx, ny});
                }
            }
            step++;
        }

        // for(int[] bbb : bb) System.out.printf("%s \n", Arrays.toString(bbb));
        return maxd;
    }

    void c() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            m = Integer.valueOf(sp[1]);
        int[] wa = new int[n + 1];
        boolean[] ac = new boolean[n + 1];
        for(int i = 0; i < m; i++)
        {
            sp = in.readLine().split(" ");
            int q = Integer.valueOf(sp[0]);
            if(sp[1].equals("WA"))
            {
                if(!ac[q]) wa[q]++;
            }
            else
            {
                if(!ac[q]) ac[q] = true;
            }
        }
        int acount = 0, wcount = 0;
        for(int i = 1; i <= n; i++)
        {
            if(ac[i])
            {
                acount++;
                wcount += wa[i];
            }
        }
        System.out.printf("%d %d\n", acount, wcount);
        
    }
    void b() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]),
            m = Integer.valueOf(sp[2]);
        sp = in.readLine().split(" ");
        int sum = m * n;
        for(int i = 0; i < n - 1; i++) {
            sum -= Integer.valueOf(sp[i]);
        }
        if(sum <= k) System.out.println(Math.max(0, sum));
        else System.out.println(-1);
    }

    void a() throws Exception
    {
        char c = in.readLine().charAt(0);
        System.out.println((char)(c + 1));
    }
}