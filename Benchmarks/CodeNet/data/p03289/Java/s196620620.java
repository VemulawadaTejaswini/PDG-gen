import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String toi = scanner.nextLine();
		int cflag = 0;
		int joken1 = 0;
		int joken2 = 0;
		int joken3 = 0;


		for(int i = 0; i < toi.length(); i++) {

			if(toi.charAt(0) == 'A') {
				joken1 = 1;
			}else {
				break;
			}

			if(2 <= i && i <= toi.length() - 2 && toi.charAt(i) == 'C' && joken2 == 0) {
				joken2++;
			}else if(0 < i  && Character.isUpperCase(toi.charAt(i))){
				joken3 ++;
				break;
			}
		}



		if(joken1 == 1 && joken2 == 1 && joken3 == 0) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
	}
}
