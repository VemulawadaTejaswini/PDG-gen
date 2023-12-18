import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		m.input();
		m.solve();
		m.output();
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);

	String S = null;
	boolean ans = false;
	
	public void input() throws IOException {
		S = br.readLine();
	}

	public void solve() throws IOException {
		ans = (S.indexOf("AC") >= 0);
	}
	
	
	public void output() {
		out.println(ans ? "Yes" : "No");
		out.flush();
		
	}
}