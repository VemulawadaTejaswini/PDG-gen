import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		for (int i=0; i<m; i++) {
			b[i] = sc.nextInt();
		}
		int res = 0;
		for (int i=0; i<n; i++) {
			long tRes = 0;
			for (int j=0; j<m; j++) {
				tRes += b[j]*sc.nextInt();
			}
			if (tRes + c > 0) {
				res++;
			}
		}
		System.out.println(res);
		sc.close();
	}

}
