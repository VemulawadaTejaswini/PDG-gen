import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc = null;
		String pres;
		int l1 = s.length();
		while(true) {
			pres = s;
			s = s.replace("01", "");
			s = s.replace("10", "");
			if(pres.equals(s)) break;
		}
		System.out.println(l1 - s.length());
	}
}