
import java.io.*;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Main {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
static StringTokenizer st;
static BitSet bs;
static int TC,N,M;
    public static void main(String[] args) throws IOException {
	// write your code here
        st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
pw.println(N==M?"Yes":"No");pw.flush();
    }
}
