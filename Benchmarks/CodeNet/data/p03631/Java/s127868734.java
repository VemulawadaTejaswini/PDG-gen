import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().exec();
	
	}

	public void exec() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		char[] Nchar = br.readLine().toCharArray();
		out.println((Nchar[0] == Nchar[2])?"Yes":"No");
		out.flush();
	}
}
