import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] grid = new char[h][w];
            for (int i = 0; i <h; i++){
                String s = in.next();
                for (int j = 0; j <s.length(); j++) {
                    grid[i][j]=s.charAt(j);
                }
            }
            boolean ans = true;
            int i=0,j=0;
            if(grid[i][j]=='#')
            while (i!=h-1||j!=w-1){
                    if (j+1<w && i+ 1<h && grid[i+1][j]=='#' && grid[i][j+1]=='#'){
                        ans=false;
                        break;
                    }
                    else if (i+1<h&& grid[i+1][j]=='#')i++;
                    else if (j+1<w && grid[i][j+1]=='#')j++;
                    else {
                        ans=false;
                        break;
                    }
            }
            else ans=false;
            if (ans) System.out.println("Possible");
            else System.out.println("Impossible");
            }
        }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}