import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Integer;
import java.util.HashMap;

class Main
{
    // driver function to test the above functions
    public static void main(String args[]) throws IOException
    {
        Reader.init(System.in);
        String s = Reader.next();
        char[] arr = s.toCharArray();
        int ans_b=0;
        for (int i=0; i<3; i++){
            char val= arr[i];
            if (val=='B'){
                ans_b++;
            }
        }

        if (ans_b==1 || ans_b==2){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }

    }

}

class solu{

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

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}