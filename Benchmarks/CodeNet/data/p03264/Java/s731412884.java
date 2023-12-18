package atcoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K;
		K = sc.nextInt();
		
		int even = K / 2;
		int odd = (K+1) / 2;
		
		System.out.println(even * odd);
	}
}
