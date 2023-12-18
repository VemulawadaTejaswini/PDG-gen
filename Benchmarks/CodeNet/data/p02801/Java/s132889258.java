import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力受け取り
		int n,k,m;
		n = sc.nextInt();
		k = sc.nextInt();
		m = sc.nextInt();
		int ai[] = new int[n-1];

		int sum = 0;

		for(int i = 0 ; i < n-1 ; i++) {
			ai[i] = sc.nextInt();
			sum += ai[i];
		}
		if((m*n)-sum <= k ) {
		System.out.println((m*n)-sum);
		}else{
			System.out.println(-1);
		}
	}
}
