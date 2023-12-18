import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short N = scanner.nextShort();
		short K = scanner.nextShort();
		int x[] = new int[N+1];
		int y[] = new int[N+1];
		boolean c[] = new boolean[N+1];
		for (int i = 1; i <= N; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			c[i] = scanner.next().equals("B");
		}
		scanner.close();
		
		short answer;
		short answer2;
		int FA = 0;
		short i;
		
		for (short heightSlide = 0; heightSlide < K; heightSlide++) {
			for (short widthSlide = 0; widthSlide < K; widthSlide++) {
				answer = 0;
				answer2 = 0;
				for (i = 1; i <= N; i++) {
					if (((((x[i] + heightSlide) % (K*2)) < K) ^ (((y[i] + widthSlide) % (K*2)) < K)) == c[i]) {
						answer++;
					} else {
						answer2++;
					}
				}
				FA = Math.max(FA, Math.max(answer, answer2));
			}
		}
		
		System.out.println(FA);
		
	}
 
}