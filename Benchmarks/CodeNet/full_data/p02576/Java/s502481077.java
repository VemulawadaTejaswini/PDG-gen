import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int T = scanner.nextInt();
		
		scanner.close();
		
		int result = N / X;
		int amari = N % X;
		
		if (amari == 0) {
			System.out.println(result * T);
		} else {
			System.out.println(result * T + T);
		}
	}

}
