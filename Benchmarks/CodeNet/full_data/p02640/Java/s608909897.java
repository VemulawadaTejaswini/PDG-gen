
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String result = "No";
		for(int i = 0; i <= x; i++) {
			for(int j = 0; j <= x - i; j++) {
				if(i + j == x && i * 4 + j * 2 == y) result = "Yes";
			}
		}
		System.out.println(result);
	}

}
