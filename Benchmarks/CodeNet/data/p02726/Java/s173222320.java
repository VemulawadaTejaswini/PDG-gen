import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();

		x--;
		y--;

		int s = y - x - 1;

		int[] g = new int[n];
		int i,j,k;

		int temp = 0;
		for(i = 0; i < n - 1; i++) {
			for(j = i + 1; j < n; j++) {
				temp = Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(y - j));
				g[temp]++;
			}
		}

		for(k = 1; k <= n - 1; k++) {
			System.out.println(g[k]);
		}
	}
}
