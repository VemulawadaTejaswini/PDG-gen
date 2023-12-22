

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		if(k % 2 == 0 || k % 2 == 5){
			System.out.println(-1);
			return;
		}

		int result = 1;
		int sevens = 7;
		while(true){
			if(sevens % k == 0){
				System.out.println(result);
				return;
			}

			sevens *= 10;
			sevens += 7;
			sevens %= k;

			result++;
		}
	}
}