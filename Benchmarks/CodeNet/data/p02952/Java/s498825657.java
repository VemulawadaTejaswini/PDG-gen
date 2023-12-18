import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		String n = sn.nextLine();
		int len = n.length();
		
		switch (len) {
		case 1:
			System.out.println(n);
			break;
		case 2:
			System.out.println(9);
			break;
		case 3:
			System.out.println(Integer.parseInt(n) - 90);
			break;
		case 4:
			System.out.println(900 + 9);
			break;
		case 5:
			System.out.println(Integer.parseInt(n) - 9000 + 90);
			break;
		case 6:
			System.out.println(90000 + 900 + 9);
			break;
		}
		
	}
	
}
