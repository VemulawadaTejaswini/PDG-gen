import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    class point{
        int x =0 , y = 0;
        point(int a , int b){
            this.x = a;
            this.y = b;
        }
    };

    static class Task {
         // for declaring
        int n , m;
        int[] in_degree;
        List<Integer>[] graph;
        int[] max_distance ;
        boolean[] visited;
        // pair for int, int - int[][] arr = new int[2][n];

        public void solve(int testNumber, InputReader in, PrintWriter out) {

                n = in.nextInt();
                m = in.nextInt();
                graph = new ArrayList[n+1];
                in_degree = new int[n+1];
                for(int i= 0 ; i < n+1 ; i++ ) {
                    graph[i] = new ArrayList<>();
                    if (i > 0) {
                        graph[0].add(i);
                        in_degree[i]++;
                    }
                }
                visited = new boolean[n+1];
                Arrays.fill(visited,false);
                max_distance = new int[n + 1];
                Arrays.fill(in_degree,0);
                int a , b;
                for(int i =0 ; i < m ; i++) {
                    a = in.nextInt();
                    b = in.nextInt();
                    in_degree[b]++;
                    graph[a].add(b);
                }
                max_distance[0]=0;
                dfs(0);
                int max_el = max_element(max_distance);
                out.println(max_el);
            }

            public void dfs(int v){
                for( int i : graph[v] ){
                    max_distance[i] = Math.max(max_distance[v]+1,max_distance[i]);
                    in_degree[i]--;
                    if(in_degree[i] == 0){
                        dfs(i);
                    }
                }
            }

            public int max_element(int[] arr){
                for(int i = 1 ; i < arr.length ; i++ ){
                    if(arr[i]>arr[0])
                        arr[0] = arr[i];
                }
                return arr[0];
            }
        }



        public static void printArray(int[] arr){
            for(int i = 0 ; i < arr.length ; i++ ){
                System.out.println(arr[i]);
            }
        }
        public static void printArray(long[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
        public static void printArray(String[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
        public static void printArray(char[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }



    }

    class InputReader {
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


