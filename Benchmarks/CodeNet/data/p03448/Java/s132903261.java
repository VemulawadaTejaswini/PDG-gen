

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int pattern = 0;
		for(int i = 0; i < A + 1; i++) {
			int sum = 500 * i;
			if(!(sum > X)) {
				for(int j = 0; j < B + 1; j++) {
					sum += 100 * j;
					if(!(sum > X)) {
						if(!((X - sum) / 50 > C)) {
							pattern++;
						}
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		System.out.println(pattern);
	}

}
