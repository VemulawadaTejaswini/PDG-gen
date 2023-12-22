import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E [][] = new int [V+1][V+1];
		for (int i=1; i<=V; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int k=0; k<b; k++){
				int c = sc.nextInt();
				E [a][c] = 1;
			}
		}
		for (int m=1; m<=V; m++){
			for (int n=1; n<=V; n++){
				System.out.print(E[m][n]+" ");
			}
			System.out.println();
		}
	}
}