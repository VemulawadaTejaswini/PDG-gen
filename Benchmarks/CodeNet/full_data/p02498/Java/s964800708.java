
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sb = br.readLine();
		boolean judge;
		Character temp;
		String out;
		for (int i = 0; i < sb.length(); i++) {
			temp = sb.charAt(i);
			out = temp.toString();
			if (Character.isLowerCase(temp)) {
				System.out.print(out.toUpperCase());
			} else {
				System.out.print(out.toLowerCase());
			}
		}
		System.out.println("");
	}

}