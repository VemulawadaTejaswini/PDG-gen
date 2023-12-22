import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out=new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String in;
		HashSet<String> ht = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			in = br.readLine();
			if (in.charAt(0) == 'i') {
				ht.add(in.substring(7));
			} else {
				out.append(ht.contains(in.substring(5))?"yes\n":"no\n");
			}
		}
		System.out.print(out);
	}
}