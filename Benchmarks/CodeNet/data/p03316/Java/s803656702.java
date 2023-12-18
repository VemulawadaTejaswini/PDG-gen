import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int s;
		int ss;
		int count = 1;
		int sho;
		try {
			Scanner sc = new Scanner(System.in);
			s = sc.nextInt();
			ss = s;
			

			// 10進化した和を出す。
			while (s >= 1) {
				count = s%10;
				s = s / 10;
				

			}
			// 割り算する
			sho = ss % count;
			System.out.println(ss);
			System.out.println(count);

			// 剰余が出たらNo
			if (sho == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
