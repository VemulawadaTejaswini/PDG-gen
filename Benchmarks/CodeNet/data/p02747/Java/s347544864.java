import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int i=0;
		boolean f = true;
		while(i<str.length()) {
			if(str.contains("hi")) {
				i = str.indexOf("hi")+2;
				if(i<str.length()) {
					char c = str.charAt(i);
					if( c !='i') {
						System.out.println("Yes");
						f=false;
						break;
					}
				} else {
					System.out.println("Yes");
					f = false;
					break;
				}
				str = str.substring(i);
			} else if(str.contains("hii")) {
				i = str.indexOf("hii")+3;
				str = str.substring(i);
			} else {
				System.out.println("No");
				f = false;
				break;
			}
		}
		if(f)System.out.println("No");
	}

}
