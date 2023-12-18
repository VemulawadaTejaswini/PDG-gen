import java.io.*;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Main {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
static StringTokenizer st;
static BitSet bs;
static int TC,N,M,a,b;
    public static void main(String[] args) throws IOException {
	// write your code here
        st= new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        String sum = "";
        for (int i=0;i<a;i++)
            sum+=b;
pw.println(sum);pw.flush();
    }
}
