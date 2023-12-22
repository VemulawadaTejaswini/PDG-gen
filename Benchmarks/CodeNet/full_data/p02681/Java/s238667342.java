import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		if (A.length() == B.length()) {
			boolean same = true;
			for (int i = 0; i < A.length(); i++) {
				if (A.charAt(i) != B.charAt(i)) {
					same = false;
					break;
				}
			}
			if (same) {
				System.out.println("Yes");
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
}
