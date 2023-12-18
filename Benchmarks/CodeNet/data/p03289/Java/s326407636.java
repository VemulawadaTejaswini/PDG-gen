import java.util.Scanner;
public class Main_104b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean c = true;
		if(s.charAt(0) == 'A' && s.substring(1, s.length()).split("C").length == 2) {
			char[] set = s.toCharArray();
			for(int i = 1; i < set.length; i++) {
				if(set[i] != 'C' && !Character.isLowerCase(set[i])) break;
			}
			c = false;
			System.out.println("AC");
		}
		if(c)System.out.println("WA");
	}
}