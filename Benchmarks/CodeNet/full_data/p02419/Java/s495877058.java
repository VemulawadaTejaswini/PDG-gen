import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String W = in.nextLine();
		W = W.toLowerCase();
		int ans = 0;
		while(in.hasNext()) {
			String s = in.nextLine();
			s = s.toLowerCase();
			if(s.equals("end_of_text")) break;
			while(s.indexOf(W) != -1) {
				if(s.equals(W) || s.contains(" "+W)) {
					ans++;
				}
				s = s.substring(s.indexOf(W)+W.length());
			}
		}
		System.out.println(ans);
	}
}