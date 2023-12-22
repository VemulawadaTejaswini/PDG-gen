import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		boolean issame = true;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				issame = false;
				break;
			}
		}
		
		if (issame) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
						
	}
}