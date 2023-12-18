import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		for(int i=0; i<s.length(); i++) {
			if(i % 2 == 0 && s.charAt(i) != 'h') {
				System.out.println("No");
				return;
			}
			if(i % 2 != 0 && s.charAt(i) != 'i') {
				System.out.println("No");
				return;
			}
		}


		System.out.println("Yes");
	}

}
