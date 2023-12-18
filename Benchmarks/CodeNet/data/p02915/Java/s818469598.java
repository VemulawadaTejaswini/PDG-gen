import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main{

    public static void main(String[] args)throws IOException{
    	br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
	int n = nextInt();
	out.println((long)Math.pow(n,3));
        out.close();
    }
        
    static BufferedReader br;
    static StringTokenizer st = new StringTokenizer("");
    static String next()throws IOException{
    	while(!st.hasMoreTokens()){
    	    st = new StringTokenizer(br.readLine());
    	}
    	return st.nextToken();
    }
    static int nextInt()throws IOException{
    	return Integer.parseInt(next());
    }
    static long nextLong()throws IOException{
    	return Long.parseLong(next());
    }
}