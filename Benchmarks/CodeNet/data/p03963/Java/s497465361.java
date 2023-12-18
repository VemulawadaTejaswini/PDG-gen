import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        APassword solver = new APassword();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class APassword {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
          	int k = sc.nextInt();
          	long num=1;
          	for (int i = 0 ; i < n-1 ;i++){
              num*=(k-1);
            }
          	out.prinltn(num*k);
        }
 
    }
 
    static class inputClass {
        BufferedReader br;
        StringTokenizer st;
 
        public inputClass(InputStream in) {
 
            br = new BufferedReader(new InputStreamReader(in));
        }
 
        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}
 