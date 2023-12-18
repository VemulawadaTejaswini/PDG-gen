import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		char c1 = 0, c2 = 0;
		String a = null, b = null;
		String result = null;

		for(int i = 0; i < s.length(); i++) {
			result = "";
			if((c1 = s.charAt(i)) != (c2 = t.charAt(i))) {
				a = s.replace(c1,c2);
				b = s.replace(c2, c1);
				for(int j = 0; j < s.length(); j++) {
					if(a.charAt(j) == b.charAt(j)) {
						result += a.charAt(j);
					}else {
						if(a.charAt(j) == s.charAt(j)) {
							result += b.charAt(j);
						}else {
							result += a.charAt(j);
						}
					}
				}
				s = result;
			}
		}
		if(s.equals(t)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}