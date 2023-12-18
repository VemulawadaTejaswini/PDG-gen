import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		
		boolean kai = true;
		String str = S;
		
		while (str.length() > 0) {
			
			if (str.endsWith("dream")) {
				str = str.substring(0,str.length() - 5);
			} else if (str.endsWith("dreamer")) {
				str = str.substring(0,str.length() - 7);
			} else if (str.endsWith("erase")) {
				str = str.substring(0,str.length() - 5);
			} else if (str.endsWith("eraser")) {
				str = str.substring(0,str.length() - 6);
			} else {
				kai = false;
				break;
			}
		}
		
		if (kai == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		 
		 scan.close();

	}
}