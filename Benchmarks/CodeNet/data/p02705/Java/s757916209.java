import javax.management.MBeanRegistration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Integer;
import java.util.HashMap;

public class Main {
    // driver function to test the above functions
    public static void main(String args[]) throws IOException {

        Reader.init(System.in);
        int n=  Reader.nextInt();
       ArrayList<Node> lis = new ArrayList<Node>();


        for (int i=0; i<n
                ; i++){
            int val = Reader.nextInt();
            int ind = i;

            Node n1 = new Node();
            n1.val = val;
            n1.ind = ind;

            lis.add(n1);
        }



        int[][] dp = new int[n+1][n+1];
        for (int i=0; i<n+1; i++){
            for (int j=0; j<n+1; j++){
                dp[i][j] = 0;
            }
        }
        Collections.sort(lis, new Node_compare());

        dp[0][1] = lis.get(0).val*(Math.abs(lis.get(0).ind));
        dp[1][0] = lis.get(0).val*(Math.abs(lis.get(0).ind));
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                int l = j;
                int r = i-j;

                dp[l+1][r] = Math.max(dp[l+1][r], dp[l][r] + lis.get(i).val*(Math.abs( lis.get(i).ind - (l) ) ));

                r = j;
                l=i-j;
                dp[l][r+1] = Math.max(dp[l][r+1], dp[l][r] + lis.get(i).val*(Math.abs( lis.get(i).ind - (n-1-r) ) ));



            }
        }
        int ans = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                ans =Math.max(ans,dp[i][j]);
            }

        }
        System.out.println(ans);


    }

}

class Node_compare implements Comparator<Node>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Node a, Node b)
    {
        if (a.val>b.val){
            return -1;
        }
        else if (a.val==b.val) {
            return 0;
        }
        else {
            return 1;
        }

    }
}

class Node{
    int val;
    int ind;


}



class solu{
    int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

}

/** Class for buffered reading int and double values */
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

    static String line() throws IOException {
        return reader.readLine();
    }
}