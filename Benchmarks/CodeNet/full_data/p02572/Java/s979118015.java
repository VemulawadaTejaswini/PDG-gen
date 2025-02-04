import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long count = 0;
		long mod = 1000000007;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				count += a[i] * a[j] % mod; 
			}
		}
		
		long answer = count % mod;
		System.out.println(answer);
		
	}

}
