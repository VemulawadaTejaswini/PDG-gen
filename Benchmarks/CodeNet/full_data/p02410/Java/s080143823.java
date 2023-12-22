import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int abeck[][] = new int[n][m];
		int bbeck[] = new int[m];
		int ancebeck[] = new int[n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				abeck[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < m ; i++){
			bbeck[i] = s.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				ancebeck[i] += abeck[i][j] * bbeck[j];
			}
			System.out.println(ancebeck[i]);
		}
		
	}

	public static void main(String[] args) {
		/* 
		 * Main x;
		 * x = new Main();
		 * x.run();
		 * ??¨????????????
		 */
		new Main().run();
		
	}
}