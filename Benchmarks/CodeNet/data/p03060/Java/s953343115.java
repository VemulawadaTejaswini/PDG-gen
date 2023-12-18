import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = 0, Y = 0;

		int N = sc.nextInt();
		
		int V[] = new int[N];
		for (int a = 0; a < N; a++) {
			V[a] = sc.nextInt();
		}
			
			for (int i = 0; i < N; i++) {
			X = V[0] + V[N - 1];	
		}
		
		int C[] = new int[N];
		for (int a = 0; a < N; a++) {
			C[a] = sc.nextInt();	
	    }
		
		for (int i = 0; i < N; i++) {
			Y = C[0] + C[N - 1];
		}			
		
		if(X-Y<0) {
			System.out.println(0);
		}else {
			System.out.println(X - Y);
		}

	}
}