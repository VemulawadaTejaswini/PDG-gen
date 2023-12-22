import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		String t2 = t.substring(0, t.length()-1);
		if (s.length()== t.length()-1 && s.equals(t2)) {
			System.out.println("Yes");}
		else {
			System.out.println("No");
		}
	}
}