import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int i=0;
		boolean f = true;

		while(f) {
			if(str.contains("hi")) {
				i = str.indexOf("hi")+2;
				if(i<str.length()) {
					char c = str.charAt(i);
					if( c !='i') {
						System.out.println("Yes");
						f=false;
					}
				} else {
					System.out.println("Yes");
					f = false;
				}
				str = str.substring(i);
				i=0;
			} else {
				break;
			}
		}
		if(f)System.out.println("No");


	}

}
