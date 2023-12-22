import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		int matchMax = 0;
		for (int i=0; i+t.length() <= s.length(); i++){
			int match = 0;
			for (int j=0; j<t.length();j++){
				if (s.charAt(i+j) == t.charAt(j)){
					match++;
				}
			}
			matchMax = Math.max(matchMax, match);
		}
		System.out.println(t.length() - matchMax);
	}


}