import java.util.Scanner;

/** AOJ_No.1179 ICPC_2012_A */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int y = sc.nextInt();/* 誕生年 */
			int m = sc.nextInt();/* 誕生月 */
			int d = sc.nextInt();/* 誕生日 */
			
			/* 誕生年の最後の日までを計算 */
			int days;
			if(m % 2 == 0 && y % 3 != 0) {/* 小の月は偶数月&3の倍数じゃない年 */
				days = 19 - d;/* 小の月 */
			} else {
				days = 20 - d;/* 大の月 */
			}
			if(y % 3 == 0) {/* 誕生年の内、誕生月より後の日数 */
				days += (10 - m) * 20;
			} else {
				for(int j = m + 1; j < 11; j++) {
					if(j % 2 == 1) {
						days += 20;
					} else {
						days += 19;
					}
				}
			}
			/* 誕生年後の日を計算 */
			for(int j = y + 1; j < 1000; j++) {
				if(j % 3 == 0) {
					days += 200;
				}else {
					days += 195;
				}
			}
			System.out.println(days + 1);
		}
	}
}

