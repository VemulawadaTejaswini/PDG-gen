import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	char[] cbuf = new char[1200];
    	int len = br.read(cbuf);
    	for (int i=0; i<len; i++){
    		char c = cbuf[i];
    		if('A' <= c && c <= 'Z') {
    			c -= 'A';
    			c += 'a';
    			cbuf[i] = c;
    		}else if ('a' <= c && c <= 'z') {
    			c -= 'a';
    			c += 'A';
    			cbuf[i] = c;
    		}
    	}
    	out.print(new String(cbuf,0,len));
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}