import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber , InputReader in , PrintWriter out){
            int h = in.nextInt();
            int w = in.nextInt();
            int[][] vec = new int[h][w];
            int[][] arr = new int[h+1][w+1];
            int [][] arr1 = new int[w+1][h+1];
            int[][] count = new int[h][w+1];
            for (int i = 0; i <h ; i++) {
                String s = in.next();
                for (int j = 0; j <s.length() ; j++) {
                    vec[i][j] = s.charAt(j);
                }
            }
            int ind1 = 0;
            for (int i = 0; i <h ; i++) {
                for (int j = 0; j < w; j++) {
                    if (vec[i][j] == '#') {
                        arr[i][ind1] = j;
                        ind1++;
                    }
                }
                arr[i][ind1] = w;
                ind1=0;
            }
                int ind2 = 0;
                for (int j = 0; j <w ; j++) {
                    for (int i = 0; i <h ; i++) {
                        if (vec[i][j] == '#'){
                            arr1[j][ind2] = i;
                            ind2++;
                        }
                    }
                    arr1[j][ind2] = h;
                    ind2=0;

                }
            for (int i = 0; i <h ; i++) {
                int k = -1 ;
                int v = 0 ;
                for (int j = 0; j < w ; j++) {
                    if (j == arr[i][v]){
                        k = arr[i][v];
                        v++;
                        continue;
                    }
                    count[i][j] = arr[i][v]-k -1;
                }
            }
            for (int j = 0; j <w ; j++) {
                int k = -1 ;
                int v = 0 ;
                for (int i = 0; i < h ; i++) {
                    if (i == arr1[j][v]){
                        k = arr1[j][v];
                        v++;
                        continue;
                    }
                    count[i][j]+= arr1[j][v]-k -1;
                }
            }
            int max =-1;
            for (int i = 0; i <h ; i++) {
                for (int j = 0; j <w ; j++) {
                    max = Math.max(max , count[i][j]);
                }
            }
            out.println(max - 1);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

}