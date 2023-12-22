

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		long ans = 1;
		int N = scanner.nextInt();

		for(int i = 0 ; i < N ; i++) {
			long A = scanner.nextLong();
			if(A == 0) {
				ans = 0;
			} else {
				if(ans <= ((long)Math.pow(10, 18) / A) && ans >= 0) {
					ans = ans * A;
				}else {
					ans = -1;
				}
			}
		}

		System.out.println(ans);

		scanner.close();

	}

}
