import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String o = stdIn.next();
		String e = stdIn.next();
		
		if(o.length()==e.length()) {
			for(int i = 0; i < o.length(); i++) {
				System.out.print(o.charAt(i));
				System.out.print(e.charAt(i));
			}
		}else {
			for(int i = 0; i < e.length(); i++) {
				System.out.print(o.charAt(i));
				System.out.print(e.charAt(i));

			}
			System.out.print(o.charAt(o.length()-1));
		}
		
		
		
	}

}
