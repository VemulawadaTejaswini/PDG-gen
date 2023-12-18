import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int k = sc1.nextInt();
		int one = 0;
		int ans = 0;
		int[] a = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = sc1.nextInt();
			if (a[i] == 1 ) {
				one = i;
			}
		}
		//System.out.println(one);

		//左側を計算する
		ans += one/(k-1);
		if((one%(k-1)) != 0) {
			ans++;
		}
		//System.out.println(ans);

		//右側を計算する
		ans += (n-1-one)/(k-1);
		if(((n-1-one)%(k-1)) != 0) {
			ans++;
		}
		System.out.println(ans);

		sc1.close();
	}

}