import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		StringBuffer line = new StringBuffer(sc.nextLine());
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch += 'A' - 'a';
				line.setCharAt(i, ch);
			} else if (ch >= 'A' && ch <= 'Z') {
				ch -= 'A' - 'a';
				line.setCharAt(i, ch);
			}
		}
		
		System.out.println(line);
		
		sc.close();
	}
}