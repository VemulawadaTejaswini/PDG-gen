import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	int x = Integer.parseInt(br.readLine());
	int y = Integer.parseInt(br.readLine());
	System.out.println(x*y + " " + (2*x+2*y));
	}
}