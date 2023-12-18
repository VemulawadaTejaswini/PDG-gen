
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String s = sc.next().toLowerCase();

			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						System.out.println("no");
					}
				}
              System.out.println("yes");
			}	
		
		}
	}
}
