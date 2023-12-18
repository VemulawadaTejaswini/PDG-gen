import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
class InputReader {
    BufferedReader buf;
    StringTokenizer tok;
 
    public InputReader() {
        buf = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            Path currentRelativePath = Paths.get("");
//            String s = currentRelativePath.toAbsolutePath().toString();
//            String curDir = System.getProperty("user.dir");
//            System.out.println("current dir: " + s);
//            buf = new BufferedReader(new FileReader("/Users/wangdong/Dropbox/LC_Java/src/test/resources/testA.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
 
    public boolean hasNext() {
        while (tok == null || !tok.hasMoreElements()) {
            try {
                tok = new StringTokenizer(buf.readLine());
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
 
    public String next() {
        if (hasNext()) return tok.nextToken();
        return null;
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
    public long nextLong() {
        return Long.parseLong(next());
    }
 
    public  Double nextDouble() {
        return Double.parseDouble(next());
    }
 
    public BigInteger nextBigInteger() {
        return new BigInteger(next());
    }
 
    public BigDecimal nextBigDecimal() {
        return new BigDecimal(next());
    }
}
 
 
public class Main {
  public static void main(String[] args) {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt();
	//     	out.println(n + " , " + m);
    	int tot = 0; 
    	int[] times = new int[m];
    	for (int i = 0; i < m; i++){
          
          times[i] = in.nextInt();
   		  tot += times[i];
          //out.print(times[i] + " , ");
        }
		out.println(tot > n ? -1  :  n-tot);
        out.close();
    }
  
}
