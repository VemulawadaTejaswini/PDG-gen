import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String s = sc.next(); s += s;
		String t = sc.next();
		System.out.println(s.contains(t)?"Yes":"No");
		
	}
}
