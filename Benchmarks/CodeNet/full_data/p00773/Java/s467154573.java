import java.util.Scanner;

public class Main
{
	static int pay(int price, int tax)
	{
		return price * (100 + tax) / 100;
	}

	static int max(int a, int b)
	{
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	static int solve(int x, int y, int sum)
	{
		int answer = 0;
		for (int i = 1;i < sum;++i) {
			for (int j = i;j < sum;++j) {
				if (pay(i, x) + pay(j, x) == sum) {
					answer = max(answer, pay(i, y) + pay(j, y));
				}
			}
		}
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int s = sc.nextInt();
		while (x > 0) {
			System.out.println(solve(x, y, s));
			x = sc.nextInt();
			y = sc.nextInt();
			s = sc.nextInt();
		}
	}
}

