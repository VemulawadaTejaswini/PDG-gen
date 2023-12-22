import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String w = sc.next();
		w.toLowerCase();
		String s = "";
		while (sc.hasNext()) {
			String str = sc.next();
			if (str.equals("END_OF_TEXT")) {break;}
			else {
				s += str;
			}
		}
		String s2 = s.replace(w," ");
		s2.toLowerCase();
		int count = 0;
		for (int i=0; i<s2.length(); i++) {
			if (s2.charAt(i)==' ') {count++;}
		}
		
		System.out.println(count);
	}
}
