import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String s = "";
		String p = "";
		try {
			s = in.readLine();
			p = in.readLine();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			flag = true;
			for (int j = 0; j < p.length(); j++) {
				int pointer = i + j;
				if (pointer >= s.length()) pointer = pointer - s.length();

				if (s.charAt(pointer) != p.charAt(j)) {
					flag = false;
					
					break;
				}
			}
			if (flag) break;
		}
		if (flag) System.out.println("Yes");
		else System.out.println("No");
	}
}