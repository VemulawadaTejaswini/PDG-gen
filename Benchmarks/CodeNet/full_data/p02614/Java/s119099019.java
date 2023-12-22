import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 * What a trick prob!
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
    // main solver
    static class Task{
        public void solve(InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int k = in.nextInt();
            char[][] b = new char[h][w];
            for (int i = 0; i < h; i++){
                b[i] = in.nextToken().toCharArray();
            }
            int cnt = 0;
            for (int row = 0; row < (1 << h); row++){
                for (int col = 0; col < (1 << w); col++){
                    int black = 0;
                    for (int y = 0; y < h; y++){
                        for (int x = 0; x < w; x++){
                            if ((row >> (h - y - 1)) % 2 == 0 && (col >> (w - x - 1)) % 2 == 0 && b[y][x] == '#'){
                                black++;
                            }
                        }
                    }
                    if (black == k){
                        cnt++;
                    }
                }
            }
            out.println(cnt);
        }
    }
    // fast input reader class;
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }
        public long nextLong(){
            return Long.parseLong(nextToken());
        }
    }
}