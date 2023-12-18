import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();

		int a;
		boolean existRyokin[] = new boolean[n];
		for (int i=0; i<m; i++){
			a = sc.nextInt();
			existRyokin[a] = true;
		}
		int leftCost = 0;
		int rightCost = 0;
		for (int i=x; i>0; i--){
			if (existRyokin[i]){
				leftCost ++;
			}
		}
		for (int i=x; i<n; i++){
			if (existRyokin[i]){
				rightCost ++;
			}
		}
		System.out.println(Math.min(leftCost, rightCost));
	}
}
