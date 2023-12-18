import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= N / R; i++) {
			for(int j = 0; j <= N / G; j++) {
				int b = N - i * R - j * G;
				if(b >= 0 && b % B == 0) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
