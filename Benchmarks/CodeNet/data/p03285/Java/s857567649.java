import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int toi = Integer.parseInt(scanner.nextLine());
		int atemp = toi;
		int btemp = toi;

		if(toi > 3) {
			if(toi % 4 == 0  || toi % 7 == 0) {
				System.out.println("Yes");
			}else{
				for(int i = 0; i < toi / 7; i ++) {
					atemp -= 4;
					btemp -= 4;
					if(atemp % 7 == 0) {
						System.out.println("Yes");
						break;
					}
					if(btemp % 4 == 0) {
						System.out.println("Yes");
						break;
					}
				}
			}
		}else{
			System.out.println("No");
		}
	}
}
