import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Y = scanner.nextInt();
		scanner.close();
		
		if (Y % 1000 != 0 || N * 10000 < Y || N * 1000 > Y) {
			System.out.println("-1 -1 -1");
			return;
		}
		if (Y / 1000 == N) {
			System.out.println("0 0 " + N);
			return;
		}
		if (Y / 5000 == N) {
			System.out.println("0 " + N + " 0");
			return;
		}
		if (Y / 10000 == N) {
			System.out.println(N + " 0 0");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			for (int i2 = 0; i2 < N; i2++) {
				for (int i3 = 0; i3 < N; i3++) {
					if (1000*i + 5000*i2 + 10000*i3 == Y && i + i2 + i3 == N) {
						System.out.println(i3 + " " + i2 + " " + i);
						return;
					}
					if (i + i2 + i3 > N) {
						break;
					}
				}
				if (i + i2 > N) {
					break;
				}
			}
		}
		System.out.println("-1 -1 -1");
		
	}
	
}