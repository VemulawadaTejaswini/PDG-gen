import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0)).append(s.length() - 2).append(s.charAt(s.length() - 1));
		System.out.println(sb);
	}
}
