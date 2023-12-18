import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;

		int num500 = scan.nextInt();
		int num100 = scan.nextInt();
		int num50 = scan.nextInt();
		int xYen = scan.nextInt();

		for(int i = 0; i <= num500; i++) {
			for(int j = 0; j <= num100; j++) {
				for(int k = 0; k <= num50; k++) {
					if(500 * i + 100 * j + 50 * k == xYen)
						count++;
				}
			}
		}

		System.out.println(count);
		scan.close();
	}

}