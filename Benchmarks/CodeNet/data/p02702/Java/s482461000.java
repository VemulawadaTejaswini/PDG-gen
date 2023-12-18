import java.math.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
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

public class Main {

    public static void main(String args[]) throws IOException{
        
		Reader.init( System.in );       
        String str =Reader.next();
        int count=0;
        //String sun=str.substring(0,4);
        //System.out.println(sun);
        for(int i=0;i<str.length()-4;i++){

                //System.out.println(str.substring(i,i+5));
                BigInteger B = new BigInteger(str.substring(i,i+5));
                if(BigInteger.ZERO == B.remainder(BigInteger.valueOf((long) 2019))){
                    count++;
                }
               // System.out.println(B);
            }
            //System.out.println(count);

        System.out.println(count);
    }

}
