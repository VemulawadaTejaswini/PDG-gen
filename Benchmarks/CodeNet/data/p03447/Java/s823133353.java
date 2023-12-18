import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count500 = sc.nextInt();
		int count100 = sc.nextInt();
		int count50 = sc.nextInt();
		int expectedSum = sc.nextInt();

		int result = getCoinsResult(count500, count100, count50, expectedSum);
		System.out.println(result);
	}

	public static void testCoins() {
		System.out.println(getCoinsResult(2,2,2,100)); // 2
		System.out.println(getCoinsResult(5,1,0,150)); // 0
		System.out.println(getCoinsResult(30,40,50,6000)); // 213
	}

	public static int getCoinsResult(int count500, int count100, int count50, int expectedSum) {
		int patterns = 0;
		for (int c500 = 0; c500 <= count500; c500++)
		{
			for (int c100 = 0; c100 <= count100; c100++)
			{
				for (int c50 = 0; c50 <= count50; c50++)
				{
					int sum = c500 * 500 + c100 * 100 + c50 * 50;
					if (sum == expectedSum)
					{
						patterns ++;
					}
				}

			}

		}
		return patterns;
	}

}
