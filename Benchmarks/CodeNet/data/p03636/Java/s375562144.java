import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String subs = s.substring(1, s.length()-1);
		subs = String.valueOf(subs.length());
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		sb.append(ch[0]);
		sb.append(subs);
		sb.append(ch[ch.length-1]);
		System.out.println(sb.toString());
	}
}