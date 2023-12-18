

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		int minLen = Integer.MAX_VALUE;
		for(int i = 1; i <= Math.sqrt(n); i++){
			if(n % i != 0){
				continue;
			}
			String a = Integer.toString(i);
			String b = Long.toString(n / i);

			minLen = Math.min(minLen, Math.max(a.length(), b.length()));
		}

		System.out.println(minLen);
	}
}