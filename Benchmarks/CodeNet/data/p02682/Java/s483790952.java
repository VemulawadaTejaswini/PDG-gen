import java.util.*;
import java.math.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
public class Main {
    public static void main(String args[])throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        in.nextToken();
        long A = (long) in.nval;
        in.nextToken();
        long B = (long) in.nval;
        in.nextToken();
        long C = (long) in.nval;
        in.nextToken();
        long K = (long) in.nval;
        if(A+B>=K)
            out.print(A);
        else{
            out.print(A-(K-A-B));
        }
        out.flush();
    
    }
}