import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		if( 0<str.length() && str.length()<11) {
			if(str.contains("hi") && !str.contains("hii") ) {
				System.out.println("Yes");
			} 
		} else {
			System.out.println("No");
		}
	}

}
