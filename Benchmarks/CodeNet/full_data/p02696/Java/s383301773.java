import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.*;

public class Main {

    //private static Object InputStream;

    public static void main(String args[]) throws IOException {
        // Object input;
       Scanner scan=new Scanner(System.in);
       long A=scan.nextLong();
       long B= scan.nextLong();
       long N=scan.nextLong();
       long x=0;
       if(N<B){
           x=N;
       }
       else if(N==B){
           x=N-1;
       }
       else if(N>B){
           x=B-1;
       }
        System.out.println((int)Math.ceil(A*x/B));
    }

}
