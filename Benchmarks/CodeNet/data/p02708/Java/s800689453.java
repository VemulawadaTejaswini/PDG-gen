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
        int k = Reader.nextInt();

        if (k==n+1){
            System.out.println(1);
        }

        else {
            long[] arr =new long[n+1];
            long prev = 0;
            arr[0] = prev;
            for(int i=1; i<=n; i++){
                arr[i] = i+prev;
                prev=arr[i];
            }
            long ans =0;
            for (int i=k; i<=n; i++){
                long min = arr[i-1];
                long max = arr[n] - arr[n-i];

                ans = (ans+(max-min+1))%(1000000007);

            }
            System.out.println(ans+1);
        }

    }
}

class Node{
    char val;
    Node nxt = null;
    Node prev=null;


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