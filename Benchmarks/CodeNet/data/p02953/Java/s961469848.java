import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int h[] = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = scan.nextInt();
		}
		
		for(int i = 0; i < N - 1; i++ ) {
			if(h[i + 1] < h[i]) {
				System.out.println("No");
				return;
			}
			
			if(h[i + 1] > h[i]) {
				h[i  + 1]--;
			}
		}
		
		System.out.println("Yes");
	}
}
