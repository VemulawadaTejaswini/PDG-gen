import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String EOL = System.getProperty("line.separator");
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	while (true){
        	String l = br.readLine();
    		if(l.equals("0"))
    			break;
    		int sum = 0;
    		for(char c : l.toCharArray()) {
    			sum += c;
    		}
    		out.println(sum - ('0'*l.length()));
    	}
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}