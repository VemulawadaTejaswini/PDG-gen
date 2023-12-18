import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		int[] res = new int[N];
		int ballCount = 0;

		for(int i=0; i<N; i++) {
			a[i] = scan.nextInt();
		}

		for(int i=N-1; i>=0; i--) {

			int sum = 0;
			for(int j=1; (i+1)*j<=N; j++) {
				sum+= res[(i+1)*j-1];
			}
			if(sum%2==a[i]) {
				res[i] = 0;
			} else {
				res[i] = 1;
				ballCount++;
			}
		}

		System.out.println(ballCount);
		for(int i=0; i<res.length; i++) {
			if(res[i]==1) {
				System.out.println(i+1 + " ");
			}
		}
	}

}