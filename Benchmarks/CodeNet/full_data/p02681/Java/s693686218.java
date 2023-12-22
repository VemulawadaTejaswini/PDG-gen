import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		if (A.length() < 1 || A.length() > 10) {
			System.out.println("No");
		} else {
			B = B.substring(1, B.length());
			
			if (A.contentEquals(B)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
						
	}
}