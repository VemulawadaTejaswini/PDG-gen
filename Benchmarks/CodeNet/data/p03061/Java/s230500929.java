import java.util.Scanner;
// 回答時間何に収まるか確認
public class Main {

	public static void main(String[] args) {
		int N = 0, maxGCD = 0, gcd = 0;

		try (Scanner scanner = new Scanner(System.in)) {

			N = scanner.nextInt();
			int[] value = new int[N];

			for (int i = 0; i < N; i++) {
				value[i] = scanner.nextInt();
			}

			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					gcd = gcd(value[i], value[j]);
					maxGCD = Math.max(maxGCD, gcd);
				}
			}

			System.out.println(maxGCD);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// https://atcoder.jp/contests/agc018/submissions/1450553
	static int gcd(int x,int y)
	{
		return y>0?gcd(y,x%y):x;
	}
}
