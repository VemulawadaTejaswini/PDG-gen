import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		for(int i=0;i<s.length();i++) {
			String rotated = rotate(s,i);
			if(rotated.equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}
	
	public static String rotate(String s,int i) {
		StringBuilder sb = new StringBuilder();
		sb.append(s.substring(i, s.length()));
		sb.append(s.substring(0,i));
		return sb.toString();
	}

}
