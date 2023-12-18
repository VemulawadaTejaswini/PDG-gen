import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.jar.JarOutputStream;

public class Main {

    public static void recurse(ArrayList<ArrayList<Integer>> adj, int[] dp,int[] visited, int v){

        visited[v]=1;

        for(int i=0;i<adj.get(v).size();i++){
            if(visited[adj.get(v).get(i)]!=1){
                recurse(adj,dp,visited,adj.get(v).get(i));
            }
            dp[v]=Math.max(dp[v],dp[adj.get(v).get(i)]+1);

        }
    }

    public static void main(String[] args) throws IOException {

        Reader.init(System.in);
        int n = Reader.nextInt();
        int m = Reader.nextInt();
        ArrayList<ArrayList<Integer> > adj = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int[] edge = Reader.nextIntArray(2);
            adj.get(edge[0]-1).add(edge[1]-1);
        }
        int maxVal = 0;
        int[] dp=new int[n];
        int[] visited = new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                recurse(adj,dp,visited,i);
            }
        }
        for(int i=0;i<n;i++){
            maxVal = Math.max(maxVal,dp[i]);
        }
        System.out.println(maxVal);

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
    static String nextLine() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( nextLine() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong(nextLine());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( nextLine() );
    }

    static float nextFloat() throws IOException {
        return Float.parseFloat( nextLine() );
    }
    static int[] nextIntArray(int length) throws IOException {
        int[] arr = new int[length];
        //System.out.println(length);
        for (int i=0; i<length; i++) {
            arr[i] = Integer.parseInt( nextLine() );
            //System.out.println(arr[i]);
        }
        //System.out.println(arr);
        return arr;
    }
    static long[] nextLongArray(int length) throws IOException {
        long[] arr = new long[length];
        for (int i=0; i<length; i++) {
            arr[i] = Long.parseLong( nextLine() );
        }
        return arr;
    }

}

