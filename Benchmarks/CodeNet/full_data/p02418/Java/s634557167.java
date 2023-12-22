
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String p = sc.nextLine();

		sc.close();

		for(int offset=0; offset<s.length(); offset++) {
			String cmpStr = "";
			for(int i=0; i<p.length(); i++) {
				int count = i + offset;
				if(count >= s.length()) count = count - s.length();
				cmpStr += s.charAt(count);
			}
			if(cmpStr.equals(p)) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");

	}

}
