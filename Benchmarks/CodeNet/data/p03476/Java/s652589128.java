import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[] isprime = new boolean[100001];
		int[] likenum = new int[100001];
		int[] sum = new int[100001];
		sum[0] = 0;
		int q = sc.nextInt();

		for(int i = 0; i <= 100000; i++) {
			isprime[i] = true;
			likenum[i] = 0;
		}

		isprime[0] = false;
		isprime[1] = false;


		for(int i = 2; i <= 100000; i++) {
			if(isprime[i]) {
				for(int j = 2; i*j <= 100000; j++) {
					isprime[i*j] = false;
				}
				if(i%2 == 1 && isprime[(i+1)/2]) {
					likenum[i] = 1;
				}
			}
		}

		for(int i = 1; i <= 100000; i++) {
			sum[i] = sum[i-1] + likenum[i];
		}

		for(int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(sum[r] - sum[l-1]);
		}

		sc.close();
	}
}