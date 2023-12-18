

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s, s2;
		int count = 0;
		
		s = sc.nextLine();
		s2 = sc.nextLine();
		
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == s2.charAt(s2.length()-1-i))
				++count;
		}
		
		if(count == s.length())
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

}
