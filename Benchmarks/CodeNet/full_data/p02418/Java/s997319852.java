import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		String p = scan.nextLine();
		
		String newStr = s + s.substring(0,p.length()-1);

        if(newStr.indexOf(p) >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scan.close();
	}
}


