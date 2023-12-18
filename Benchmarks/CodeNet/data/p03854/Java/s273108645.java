import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer s = new StringBuffer();
		s.append(sc.next());
		String S = s.reverse().toString();
		S = S.replaceAll("maerd", "");
		S = S.replaceAll("remaerd", "");
		S = S.replaceAll("esare", "");
		S = S.replaceAll("resare", "");
		if(S.length() != 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
