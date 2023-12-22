import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextLong();
		}
		sc.close();

		long ans = 0L;
		for(int i=1;i<n;i++) {
			long tmp = array[i-1];
			long sa = tmp-array[i];
			if(sa>0) {
				ans = ans + tmp-array[i];
				array[i] = sa + array[i];
			}
		}

		System.out.println(ans);


	}
}
