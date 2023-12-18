import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(str.substring(str.indexOf(s)+1, str.indexOf(s)+2));
	}
}
