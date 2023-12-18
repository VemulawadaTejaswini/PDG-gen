import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        String c1 = st.nextToken();
        String c2 = st.nextToken();
        
        String c11 = String.valueOf(c1.charAt(0));
        String c12 = String.valueOf(c1.charAt(1));
        String c13 = String.valueOf(c1.charAt(2));
        String c21 = String.valueOf(c2.charAt(0));
        String c22 = String.valueOf(c2.charAt(1));
        String c23 = String.valueOf(c2.charAt(2));
        
        if (c11.equals(c23) && c12.equals(c22) && c13.equals(c21)) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
   }
}