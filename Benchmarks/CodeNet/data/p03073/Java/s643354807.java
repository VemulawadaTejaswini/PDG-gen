import java.util.*;

public class Main {
	public static String[] s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine().split("");
		String f = s[0];
		int c = 0;
		for(int i=1; i < s.length; i++) {
			if(s[i].equals(f)) {
				c++;
				if(s[i].equals("0")) s[i] = "1"; else s[i] = "0";
			}
		}
		
		System.out.println(c);
	  }
}