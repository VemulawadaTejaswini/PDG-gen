import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Lx = 0;
		int Rx = N + 1;
		int[] ans = new int[N + 1];
		
		for(int i = 0; i < M; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			Lx = Math.max(Lx, l);
			Rx = Math.min(Rx, r);
		}
		
		System.out.println(Rx - Lx + 1);
		
	}
}
