import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int [] b =  new int[n];
        int mid = n/2;
        b[mid] = a[0];
        int lo = 1;
        int hi = n-1;
        boolean big = true;
        int iteration = 1;
        if(n%2!=0) {
            while (lo<hi) {
                if(big) {
                    b[mid - iteration] = a[hi--];
                    b[mid + iteration] = a[hi--];
                }
                else {
                    b[mid - iteration] = a[lo++];
                    b[mid + iteration] = a[lo++];
                }
                iteration++;
                big = !big;
            }
        }
        else {
            while (lo<hi) {
                if(big) {
                    b[mid - iteration] = a[hi--];
                    b[mid + iteration] = a[hi--];
                }
                else {
                    b[mid - iteration] = a[lo++];
                    b[mid + iteration] = a[lo++];
                }
                iteration++;
                big = !big;
            }
            b[0] = a[lo];
        }
        int sum = 0;
        for (int i = 0; i < b.length - 1; i++) {
            sum+=Math.abs(b[i] - b[i+1]);
        }
        out.println(sum);
        out.flush();
    }
    private static List<Integer> divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i*i<=n; i++) {
            if(n%i==0) {
                list.add(i);
                if(n/i!=i) {
                    list.add(n/i);
                }
            }
        }
        return list;
    }
    public static int shortestDistance(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 0) {
                    int distance = bfs(grid,i,j);
                    min = Math.min(min,distance);
                }
            }
        }
        return min;
    }
    static int bfs(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        LinkedList<Point> q = new LinkedList<>();
        q.add(new Point(i,j));
        int distance = 0;
        int result = 0;
        boolean[][] visited = new boolean[n][m];
        visited[i][j] = true;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int k=0;k<size;k++) {
                Point pop = q.pollFirst();
                int x = pop.getX();
                int y = pop.getY();
                if(check(grid,x+1,y,n,m,visited)) {
                    if(grid[x+1][y] == 1) result+=distance;
                    else  {
                        q.addLast(new Point(x+1,y));
                        visited[x+1][y] = true;
                    }
                }
                if(check(grid,x-1,y,n,m,visited)) {
                    if(grid[x-1][y] == 1) result+=distance;
                    else  {
                        q.addLast(new Point(x-1,y));
                        visited[x-1][y] = true;
                    }
                }
                if(check(grid,x,y+1,n,m,visited)) {
                    if(grid[x][y+1] == 1) result+=distance;
                    else  {
                        q.addLast(new Point(x,y+1));
                        visited[x][y+1] = true;
                    }
                }
                if(check(grid,x,y-1,n,m,visited)) {
                    if(grid[x][y-1] == 1) result+=distance;
                    else {
                        q.addLast(new Point(x,y-1));
                        visited[x][y-1] = true;
                    }
                }
            }
            distance++;
        }
        return result;
    }
    static boolean check(int[][] grid,int x,int y, int n, int m, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < n && y < m && !visited[x][y] && grid[x][y] != 2;
    }

    private static boolean isPalindrome(char [] c, int i, int j) {
        if(i>=j) return true;
        if(c[i]!=c[j]) return false;
        return isPalindrome(c,++i,--j);
    }
    static int [] freq (char [] c) {
        int [] f = new int[26];
        for(char cc : c) {
            f[cc-'a']++;
        }
        return f;
    }
    static int check (int [] f, int k) {
        int count = 0;
        for (int i = 0; i < f.length; i++) {
            if(f[i] > 1) return 1;
            if(f[i] == 1) count++;
        }
        if(count == k) return 0;
        return -1;
    }
}
class Point {
    int x;
    int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
class InputReader extends BufferedReader {
    StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        super(new InputStreamReader(inputStream), 32768);
    }

    public InputReader(String filename) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return tokenizer.nextToken();
    }
    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream outputStream) {
            super(outputStream);
        }

        public OutputWriter(Writer writer) {
            super(writer);
        }

        public OutputWriter(String filename) throws FileNotFoundException {
            super(filename);
        }

        public void close() {
            super.close();
        }
    }
}