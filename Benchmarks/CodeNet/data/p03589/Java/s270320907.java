import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1 ; i <= 3500 ; i++) {
			for(int j = 1 ; j <= 3500 ; j++) {
				if(4 / N >= 1 / i + 1 / j && (4 * i * j - (N * (i + j))) != 0) {
					int a = N * i * j / (4 * i * j - (N * (i + j)));
					System.out.print(i + " " + j + " " + a);
					return;
				}
			}
		}
	}
}