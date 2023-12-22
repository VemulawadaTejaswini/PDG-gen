import java.io.*;
import java.util.*;

public class Main {
	static Reader in = new InputStreamReader(System.in);
	static Writer out = new PrintWriter(System.out);

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(in)) {
			int n = Integer.parseInt(br.readLine());
			Set<String> set = new HashSet<String>();
			for (int i = 0; i < n; i++) {
				set.add(br.readLine());
			}
			out.write(set.size());
		}
	}

}