import java.io.*;
import java.util.*;
public class Main {

    final static boolean fileIO = false;
    final static boolean DEBUG = false;
    final static String input = "input.txt";
    final static String output = "output.txt";
    
    public static void main(String args[]) throws Exception {

		InputStream is = null;
		OutputStream os = null;
		if (fileIO) {
			is = new FileInputStream("input.txt");
			os = new FileOutputStream("output.txt");
		} else {
			is = System.in;
			os = System.out;
		}
		InputReader in = new InputReader(is);
		PrintWriter out = new PrintWriter(os);
		new Task_A().solve(in, out);
		out.close();	

	}

static class Task_A {
	
	public void solve(InputReader in, PrintWriter out) {
		char a[] = in.nextString("\n").toCharArray();
		boolean ans = false;
		if ((a[0] == a[1] && a[1] == a[2]) || (a[1] == a[2] && a[2] == a[3])){
			ans = true;
		}
		out.println(ans ? "Yes" : "No");
	}
}


static class InputReader {
	
	private StringTokenizer tokenizer;
	private BufferedReader reader;

	public InputReader(InputStream is) {
		tokenizer = null;
		reader = new BufferedReader(new InputStreamReader(is), 32768);
	}

	public String nextString(String delim) {
		String ans = null;
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				String line = reader.readLine();
				if (line != null) {
					tokenizer = new StringTokenizer(line, delim);
					ans = tokenizer.nextToken();
				} else {
					ans = null;
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} else {
			ans = tokenizer.nextToken();
		}
		return ans;
	}
}
}


