import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String buf = br.readLine();
	int x = Integer.parseInt(buf);
	buf = br.readLine();
	int y = Integer.parseInt(buf);
	System.out.println(x*y + " " + (2*x+2*y));
	
	}
}