import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[N + 1];
		double a = Math.pow(10, 9);
		int count = 0;
		double D = 0;
		
		for(int i = 1; i < (N + 1); i++) {
			x[i]  = sc.nextInt();
			a = Math.min(a, Math.abs(x[i] - X));
		}
		
		for(int j = 1; j < a; j++) {
			count = 0;
			for(int i = 1; i < (N + 1); i++) {
				if((Math.abs(x[i] - X) % (a / j) == 0)) {
					count++;
				}
			
			}
			if(count == N) {
				D = (a / j);
				break;
			}		
		}
		System.out.println((int)D);
	}
}
