import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        long n = in.nextLong();
        long m = in.nextLong();
        long max = Long.MIN_VALUE;
        for (int i = 1; i*i <=m; i++) {
            if(m%i==0) {
                if(i*n<=m) {
                    max = Math.max(max,i);
                }
                if((m/i)*n<=m) {
                    max = Math.max(max,m/i);
                }
            }
        }
        out.println(max);
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
    private boolean dfs(String [] maze,int i,int j,boolean[][] visited) {
        if(i<0 || i>=maze.length || j<0 || j>=maze[0].length() || visited[i][j] || maze[i].charAt(j) == '*') {
            return false;
        }
        if(maze[i].charAt(j) == 'T') return true;
        visited[i][j] = true;
        return dfs(maze,i+1,j,visited) || dfs(maze,i-1,j,visited) || dfs(maze,i,j+1,visited) || dfs(maze,i,j-1,visited);

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