import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] a = new int[M];
		int[] b = new int[M];
		
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		int check = 0;
		
		for(int i = 0; i < M; i++) {
			if(a[i] == 1) {
				for(int j = 0; j < M; j++) {
					if(b[i] == a[j]) {
						if(b[j] == N) {
							System.out.println("POSSIBLE");
							check++;
							break;
						}
					}
				}
			}
		}
		if(check == 0) {
			System.out.println("IMPOSSIBLE");
		}
	}
}
