import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int two = 0;
		int a = 0;
		int ans = 0;
		int ans2 = 0;

		for (int i=0; i < N; i++) {
			a = sc.nextInt();
			if (a == 2) {
				two++;
				continue;
			}

			if (a % 4 == 0) {
				ans++;
			} else {
				ans2++;
			}
		}

	//	if (two % 2 == 0) {
			ans += two/2;
	//	}
			ans2 += two%2;

	//		System.out.println(ans);
		if (ans2 - ans <= 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}



//		for (int i=0; i < n; i++) {
//
//			if (i < n - 1 && lv[i] != lv[i+1]) {
//				imp_flag = 0;
//			}
//
//			if ( i < (n-1) && po[i]>=0 &&(lv[i] < lv[i+1])) {
//				System.out.println("Impossible");
//				System.exit(0);
//			}
//
//			if ( i < (n-1) && po[i]<=0 &&(lv[i] > lv[i+1])) {
//				System.out.println("Impossible");
//				System.exit(0);
//			}
//
//
//
//
//		}
//
//		if (imp_flag == 1){
//			System.out.println("Infinity");
//		}

	}
}

