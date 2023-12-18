import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		int gohyaku = scanner.nextInt();
		int hyaku = scanner.nextInt();
		int goju = scanner.nextInt();
		int goukei_input = scanner.nextInt();

		int toori = 0;

		for(int i = 0; i <= gohyaku; i++) {
			for(int j = 0; j <= hyaku; j++) {
				for(int k = 0; k <= goju; k++) {
					int goukei;
					goukei = i * 500 + j * 100 + k * 50;
					if(goukei_input == goukei) {
						toori++;
					}
				}
			}
		}
		System.out.println(toori);
	}
}
