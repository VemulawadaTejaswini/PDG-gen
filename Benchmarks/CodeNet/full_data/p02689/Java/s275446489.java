import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] h = new int[n+1];
		int count = 0;
		int[] ma = new int[n+1];

		for(int i=1;i<=n;i++) {
			h[i] = scan.nextInt();
		}

		for(int j=0;j<m;j++) {

			int a = scan.nextInt();
			int b = scan.nextInt();
			ma[a] = Math.max(ma[a], h[b]);
			ma[b] = Math.max(ma[b], h[a]);

			}

		for(int i=1;i<ma.length;i++) {

			if(h[i] > ma[i]) {
				count++;
			}
		}
			System.out.println(count);


		scan.close();

	}

}
