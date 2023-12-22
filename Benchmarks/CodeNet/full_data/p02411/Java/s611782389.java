import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	String[] s;
    	int m,f,r;
    	while(true) {
    		s = br.readLine().split(" ");
    		m = Integer.parseInt(s[0]);
            f = Integer.parseInt(s[1]);
            r = Integer.parseInt(s[2]);
            if(m == -1 && f == -1 && r == -1)
            	break;
            if(m == -1 || f == -1)
            	out.println("F");
            else if (m + f >= 80)
            	out.println("A");
            else if (m + f >= 65)
            	out.println("B");
            else if (m + f >= 50)
            	out.println("C");
            else if (m + f >= 30)
            	out.println(r>=50 ? "C" : "D");
            else
            	out.println("F");
    	}
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}