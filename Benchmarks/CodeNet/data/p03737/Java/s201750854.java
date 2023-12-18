import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		StringBuilder sb = new StringBuilder();
		int sa = 'A' - 'a';
		sb.append((char)(a.charAt(0) + sa));
		sb.append((char)(b.charAt(0) + sa));
		sb.append((char)(c.charAt(0) + sa));
		System.out.println(sb);
	}
}