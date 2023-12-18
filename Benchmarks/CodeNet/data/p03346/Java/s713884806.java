import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int num = n;
		boolean flag = false;
		int[] p = new int[n];
		int[] temp_p = new int[n];
		int re = 0;
		int ans = 0;

		for ( int i = 0 ; i < n ; i++ ) {
			p[i] = sc1.nextInt();
			temp_p[i] = p[i];
		}

		Arrays.sort(temp_p);

		for (int i = 1; i< n ; i++){

			flag = false;

			for (int j = 0 ; j<num ; j++) {

				if(p[j] == temp_p[n-i]) {
					flag = true;
					num = j;
					break;
				}

		}
			if (flag) {
				//System.out.println(p[num]);
				re++;
			}
			else  {
				break;
			}

		}

		ans = n - re;

		System.out.println(ans);

		sc1.close();

	}

}