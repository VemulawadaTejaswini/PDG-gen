import java.io.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		String str = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
			str = br.readLine();
		} catch (IOException e) {
		}
		
		int e = 0;
		int w = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'E') e++;
			else w++;
		}
		
		System.out.println(Math.max(e, w));
	}
}
