import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] sArray = new String[s.length()];

		for (int i = 0; i < s.length(); i++) {
			String s2 = String.valueOf(s.charAt(i));
			sArray[i] = s2;
		}

		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i].equals("B")) {
				sArray[i] = "";
				sArray[i - 1] = "";
				
			}
		}
		for (int i = 0; i < sArray.length; i++) {
			System.out.print(sArray[i]);
		}

	}

}
