import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Integer bar[] = {1, 9, 7, 4};

			int in_bar[] = new int[4];

			for (int i=0; i<4; i++) {
				in_bar[i] = sc.nextInt();
			}
			
			int ok_count = 0;

			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					if (bar[i] == in_bar[j]) {
						ok_count++;
						break;
					}
				}
			}
			
			if (ok_count == 4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}