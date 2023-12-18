import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] ab = new int[N][2];
		for(int i=0;i<N;i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}

		int[][] cd = new int[N][2];
		for(int i=0;i<N;i++) {
			cd[i][0] = sc.nextInt();
			cd[i][1] = sc.nextInt();
		}

		int ans = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(ab[i][0] < cd[i][0] && ab[i][1] < cd[i][1]) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}

}
