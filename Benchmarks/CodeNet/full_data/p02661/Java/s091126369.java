import javax.management.MBeanRegistration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
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


        int n = Reader.nextInt();

        long ans = 0;

        long eve_1_min=0;
        long eve_1_max=0;
        long eve_2_min=0;
        long eve_2_max=0;


        ArrayList<Node> lis  = new ArrayList<Node>();
        for (int i=0; i<n; i++){
            Node n1 = new Node();

            n1.min =Reader.nextLong();
            n1.max =Reader.nextLong();

            lis.add(n1);

        }

        Collections.sort(lis, new Node_compare());



        if (n%2==0){

                eve_1_min =lis.get((int)n/2 - 1).min;
                eve_1_max =lis.get((int)n/2 - 1).max;


                eve_2_min=lis.get((int)n/2).min;
                eve_2_max =lis.get((int)n/2).max;

                ans = eve_2_max+eve_1_max-(eve_1_min+eve_2_min)+1;



        }

        else {

                ans = Math.abs(lis.get(((n+1)/2)-1).max - lis.get(((n+1)/2)-1).min)+1;


        }

        System.out.println(ans);





    }

}

class Node_compare implements Comparator<Node>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Node n1, Node n2)
    {
        if(n1.min-n2.min==0){
            return (int)(n1.max-n2.max);
        }
        return (int)(n1.min-n2.min);


    }
}

class Node{
    long min;
    long max;


}



class solu{

    int bin (int[][] arr, int l, int r, int val){
        while(r-l>1){
            int m = l+((r-l)/2);
            if (arr[m][0]>=val){
                r=m;
            }
            else {
                l=m;
            }
        }
        return r;
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