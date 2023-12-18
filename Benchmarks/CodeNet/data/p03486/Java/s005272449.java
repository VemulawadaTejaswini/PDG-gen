import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		char[] sletter = new char[s.length()];
		char[] tletter = new char[t.length()];

		for(int i=0; i<s.length(); i++) {
			sletter[i] = s.charAt(i);
		}Arrays.sort(sletter);
		for(int j=0; j<t.length(); j++) {
			tletter[j] = t.charAt(j);
		}Arrays.sort(tletter);

		s = new String(sletter);
		t = new String(tletter);

		if(s.compareTo(t) < 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
