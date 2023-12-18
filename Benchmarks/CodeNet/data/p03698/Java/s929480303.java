
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i), i+1) != -1) {
				System.out.print("no");
				break;
			}
			if(i == s.length()-1) {
				System.out.print("yes");
			}
		}
	}
}
