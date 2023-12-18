

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int p = sc.nextInt();
		char[] input = sc.next().toCharArray();

		int[] pCount = new int[10001];

		long count = 0;
		long tmp = 0;
		int times = 1;
		long result = 0;

		for(int j = n - 1; j >= 0; j--){
			tmp += (input[j] - '0') * times;

//			System.out.println(tmp);

			int mod = (int)(tmp % p);
//			System.out.println("% "+p+" = "+mod);

			result += pCount[mod];

			if(mod == 0){
				result++;
			}

//			System.out.println("add "+pCount[mod]);

			pCount[mod]++;

			times *= 10;
			times %= p;
//			System.out.println("count "+count);
		}



		System.out.println(result);
	}
}
