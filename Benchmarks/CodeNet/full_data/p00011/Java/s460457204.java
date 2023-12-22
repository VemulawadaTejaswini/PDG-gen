import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] w;
		
		int m = scan.nextInt();		
		int n = scan.nextInt();
		
		int a, b;
		int swap;
		
		w = new int[m];
		for(int i = 0; i < m; i++){
			w[i] = i + 1;
		}

		for(int i = 0; i < n; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			swap = w[a-1];
			w[a-1] = w[b-1];
			w[b-1] = swap;
		}
		
		for(int i = 0; i < m; i++){
			System.out.println(w[i]);
		}
	}
}