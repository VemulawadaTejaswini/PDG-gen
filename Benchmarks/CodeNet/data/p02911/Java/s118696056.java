import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();

		int[] pt = new int[n+1];
		for(int j=1; j<=n; j++) pt[j] = k;

		for(int i = 1; i <= q; i++) {
			int a = sc.nextInt();
			for(int j =1; j<=n; j++) {
				if(j != a) pt[j]--;
			}
		}
		for(int j=1; j<=n; j++) {
			if(pt[j]>0) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}