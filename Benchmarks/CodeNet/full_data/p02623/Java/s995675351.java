import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		int[] as = new int[n];
		int amax = 0;
		int amaxCnt = 0;
		int [] bs = new int[m];
		int bmax = 0;
		int bmaxCnt = 0;
		for (int i = 0; i< n; i++) {
			as[i] = sc.nextInt();
			amax += as[i];
			if (amax > k) {
				amax -= as[i];
				break;
			} else {
				amaxCnt++;
			}
		}
		sc.nextLine();
		for (int i = 0; i< m; i++) {
			bs[i] = sc.nextInt();
			bmax += bs[i];
			if (bmax > k) {
				bmax -= bs[i];
				break;
			} else {
				bmaxCnt++;
			}
		}
		int ans = amaxCnt;
		int tarV = amax;
		int tmpa = amax;
		for (int i = amaxCnt; i >= 0; i--) {
			if (i != amaxCnt) {
				tarV = tmpa - as[i];
				tmpa = tarV;
			}
			int tmp = i;
			for (int j = 0; j < bmaxCnt; j++) {
				tarV = tarV + bs[j];
				if (tarV > k) {
					break;
				} else {
					tmp++;
					if (tmp > ans) {
						ans = tmp;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
}
