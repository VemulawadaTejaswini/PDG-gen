import java.util.Scanner;

public class Main {
	
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int K2 = K*2;
		int x[] = new int[N+1];
		int y[] = new int[N+1];
		boolean c[] = new boolean[N+1];
		for (int i = 1; i <= N; i++) {
			x[i] = scanner.nextInt();
//			y[i] = scanner.nextInt();
//			c[i] = scanner.next().equals("B");
			y[i] = scanner.nextInt() + ( scanner.next().equals("B") ? 0 : K);
		}
		scanner.close();
		
		int answer;
		int answer2;
		int FA = 0;
		int i;
		
		for (int heightSlide = 0; heightSlide < K; heightSlide++) {
			for (int widthSlide = 0; widthSlide < K; widthSlide++) {
				answer = 0;
				answer2 = 0;
				for (i = 1; i <= N; i++) {
//					if (((((x[i] + heightSlide) % (K2)) < K) ^ (((y[i] + widthSlide) % (K2)) < K)) == c[i]) {
//						answer++;
//					} else {
//						answer2++;
//					}
					if (((((x[i] + heightSlide) % (K2)) < K) ^ (((y[i] + widthSlide) % (K2)) < K)) == c[i]) {
						answer++;
					} else {
						answer2++;
					}
				}
				FA = FA > answer ? FA : answer;
				FA = FA > answer2 ? FA : answer2;
			}
		}
		
		System.out.println(FA);
		
	}
	
}