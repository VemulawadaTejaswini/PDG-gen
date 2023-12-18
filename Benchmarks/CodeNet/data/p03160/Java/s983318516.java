
/*
9 2
        1 1 1 1 1 0 0 0 0
        1 2
        1 5
        5 6
        5 7
        2 3
        2 4
        3 8
        3 9
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {


    static LinkedList<Integer> adj[];
    static boolean[] visited;
    static boolean[] visited_;
    static int[] ans;
    static int count_ = 0;
    static final int MAX_SIZE = 1000001;
    static Vector<Boolean> isprime = new Vector<>(MAX_SIZE);
    static Vector<Integer> prime = new Vector<>();
    static Vector<Integer> SPF = new Vector<>(MAX_SIZE);

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = Reader.nextInt();
        }
        if (n==1){
            System.out.println(0);
            System.exit(0);
        }
        else if (n==2){
            System.out.println(Math.abs(arr[1]-arr[0]));
            System.exit(0);
        }
        else{
            ans[1] = Math.abs(arr[1] - arr[0]);
            for (int i=2; i < n ; i++){
                ans[i] = Math.min(Math.abs(arr[i] - arr[i-2]) + ans[i-2],Math.abs(arr[i]-arr[i-1]) + ans[i-1]);
            }
        }

        for (int i = 0 ; i < n ; i++){
            //System.out.println(ans[i] + " ");
        }
        System.out.println(ans[n-1]);



    }
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}