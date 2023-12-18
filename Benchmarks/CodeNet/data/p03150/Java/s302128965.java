import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		String k = "keyence";

		List<String> s = new ArrayList<>();

		int j = 0;
		StringBuilder t = new StringBuilder();
		StringBuilder k2 = new StringBuilder();
		for(int i=0;i<S.length();i++) {

			if(j < k.length() && S.charAt(i) == k.charAt(j)) {
				if(!t.toString().isEmpty()) {
					s.add(t.toString());
					t = new StringBuilder();
				}
				k2.append(S.charAt(i));
				j++;
			}else {
				t.append(S.charAt(i));
			}
		}

		if(!t.toString().isEmpty()) s.add(t.toString());

		if(k2.toString().equals(k) && s.size() < 2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
