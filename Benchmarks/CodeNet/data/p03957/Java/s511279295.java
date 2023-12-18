import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char c[] = string.toCharArray();
		boolean b = false;
		for (int i = 0; i < c.length; i++) {
			if(!b && c[i] == 'C'){
				b = true;
			}
			if(b && c[i] == 'F'){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}