import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int x[] = new int[N+1];
		int y[] = new int[N+1];
		boolean c[] = new boolean[N+1];
		for (int i = 1; i <= N; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			c[i] = scanner.next().equals("B");
		}
		scanner.close();
		
		int answer = 0;
		int FA = 0;
		
		for (int heightSlide = 0; heightSlide < K * 2; heightSlide++) {
			for (int widthSlide = 0; widthSlide < K * 2; widthSlide++) {
				answer = 0;
				for (int i = 1; i <= N; i++) {
					if (((((x[i] + heightSlide) % (K*2)) - K < 0) ^ (((y[i] + widthSlide) % (K*2)) - K < 0)) == c[i]) {
						answer++;
					}
				}
				FA = Math.max(FA, answer);
			}
		}
		
		System.out.println(FA);
		
	}

}