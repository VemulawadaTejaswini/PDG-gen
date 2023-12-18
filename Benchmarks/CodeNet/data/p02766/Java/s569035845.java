import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int degit = 0;
		
		do {
			degit++;
			n /= k;
		} while (n > 0);
		System.out.println(degit);
		
		sc.close();
	}
}




