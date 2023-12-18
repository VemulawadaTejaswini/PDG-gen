import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		
		for (int i = N; i > 0; i -=2) {
			System.out.print(map[i - 1]);
			if (N != 1) {
				System.out.print(" ");
			}
		}
		
		for (int i = N % 2; i < N; i += 2) {
			System.out.print(map[i]);
			if (i + 2 < N) {
				System.out.print(" ");
			}
		}
		
	}
}