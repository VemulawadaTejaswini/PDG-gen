import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;




public class Main {
    ArrayList<Integer>[] graph;
    boolean[] vis;
    int[] cost;
    queue q = new queue((int)1e6);
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        new Main();
    }

    Main() throws IOException {
        solve();
    }

    void solve() throws IOException {
        Reader.init(System.in);
        int N = Reader.nextInt();
        int K = Reader.nextInt();
        int c1 = N/K;
        if((K&1) == 1){System.out.println((c1*(c1)*(c1)));}
        else{
            int c2 = N/K;
            if(N%K >= K/2){c2 += 1;}
            System.out.println(((c1)*(c1)*(c1)) + (c2*c2*c2));
        }
    }

}

class queue{
    int front;
    int rear;
    int[] array;
    int capacity;
    int size;
    queue(int cap){
        front = rear = -1;
        array = new int[cap+1];
        capacity = cap;
        size = 0;
    }

    void enqueue(int x){
        if(front == -1){
            array[++front] = x;
            rear++;
            size++;
            return;
        }
        else{
            array[++rear] = x;
            size++;
        }
    }

    int dequeue(){
        if(size == 0){return -1;}
        if(front == rear){
            int out = array[front];
            front = rear = -1;
            size--;
            return out;
        }
        else{
            size--;
            return array[front++];
        }
    }
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    /** call this method to initialize reader for InputStream */

    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");

    }

    static String nextToken() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {

                tokenizer = new StringTokenizer(reader.readLine());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    static String next() throws IOException {

        while ( ! tokenizer.hasMoreTokens() ) {

            tokenizer = new StringTokenizer(

                    reader.readLine() );

        }
        return tokenizer.nextToken();

    }

    static int nextInt() throws IOException {

        return Integer.parseInt( next() );

    }

    static double nextDouble() throws IOException {

        return Double.parseDouble( next() );

    }

    static long nextLong() {

        return Long.parseLong(nextToken());
    }
}