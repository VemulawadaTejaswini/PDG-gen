import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] h = new int[n+1];
		int count = 0;
		int[] max = new int[n+1];

		for(int i=0;i<n;i++) {
			h[i] = scan.nextInt();
		}

		for(int j=0;j<m;j++) {

			int a = scan.nextInt();
			int b = scan.nextInt();
			max[a] = Math.max(max[a], h[b]);
			max[b] = Math.max(max[b], h[a]);

			}

		for(int i=1;i<max.length;i++) {

			if(h[i] > max[i]) {
				count++;
			}
		}
			System.out.println(count);


		scan.close();

	}

}
