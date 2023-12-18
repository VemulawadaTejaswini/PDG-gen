import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		
		boolean r = true;
		
		if (s.length() != t.length())
			r = false;
		else
			for (int i = 0; i < s.length(); i++){
				for (int j = i; j < s.length(); j++){
					if (s.charAt(i) == s.charAt(j) && t.charAt(i) != t.charAt(j))
						r = false;
					else if (s.charAt(i) != s.charAt(j) && t.charAt(i) == t.charAt(j))
						r = false;
				}
			}
		if (r)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}