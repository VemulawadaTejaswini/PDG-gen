import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextLong();
			if(array[i]==0) {
				System.out.println(0);
				return;
			}
		}
		sc.close();

		long max = 1000000000000000000L;


		long ans = 1L;
		for(long i :array) {
			long tmp = max/ans;
			if(i>tmp) {
				System.out.println(-1);
				return;
			}
			ans = ans*i;

		}
		System.out.println(ans);
	}
}
