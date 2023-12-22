import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
    private static  BufferedReader  br = null;
 
    static {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String	stdin = null;
        String	out   = "";
 
        while ((stdin = parseStdin()) != null) {
            String	tmp = "";
        	for(char c:stdin.toCharArray()) {
        		if (c == ' ' || c == '.' || c == ',') {
        			int	nLen = tmp.length();
        			if (3 <= nLen && nLen <= 6) {
        				out = (out.isEmpty()) ? tmp : out + " " + tmp;
        			}
        			tmp = "";
        		}
        		else {
        			tmp += c;
        		}
        	}
        }
 
        System.out.println(out);
    }
 
    private static String parseStdin() {
        String  stdin = null;
 
        try {
            stdin = br.readLine();
        }
        catch (IOException e) {}
 
        return stdin;
    }
}