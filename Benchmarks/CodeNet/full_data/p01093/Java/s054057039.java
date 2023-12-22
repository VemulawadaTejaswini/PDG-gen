import java.util.Scanner;

public class Main
{

	// 絶対値を求める関数
	static int abs(int a)
	{
		if (a < 0) {
			a = -a;
		}
		return a;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a[] = new int[1000];

		int n = sc.nextInt();
		
		while (n > 0) {
			int best = 1000000;
			
			for (int i = 0;i < n;i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0;i < n;++i) {
				for (int j = i + 1;j < n;++j) {
					if (abs(a[i] - a[j]) < best) {
						best = abs(a[i] - a[j]);
					}
				}
			}
			
			System.out.println(best);

			n = sc.nextInt();
		}
	}
}

