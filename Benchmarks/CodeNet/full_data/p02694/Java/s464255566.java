import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.*;

public class Main{

    //private static Object InputStream;

    public static void main(String args[]) throws IOException {
        // Object input;
        Scanner scan=new Scanner(System.in);
        long P=100;
        long X=scan.nextLong();
        int x=0;
        long it=0;
        while (P<X){
            it= (long) Math.ceil(P/100);
            P= P+it;
            x++;
            //System.out.println(P);
        }
        System.out.println(x);
    }

}
