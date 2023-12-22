

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;

		do {
			int n = sc.nextInt();
			
			int x = sc.nextInt();
			int sum = 0;


			for (int i = 1; i < 3; i++)
				for (int j = 3; j < n; j++)
					for (int k = n-1; k < x; k++)
						
						if (n == 0 && x == 0)
							break;

						else if (i != j && j != k && k != i) {
							sum = i+j+k;
							cnt = check(sum,x,cnt);

						}
			System.out.println(cnt);

		} while (true);

	}

	static int check(int sum, int x, int cnt) {
		if (sum == x){
			cnt++;

		}

		return cnt;
	}

}