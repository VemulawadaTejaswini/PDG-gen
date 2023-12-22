import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int bitArrayA[] = new int[32];
		int bitArrayB[] = new int[32];

		for(int i = 0; a > 0; i++) {
			bitArrayA[i] = (int)(a % 2);
			a /= 2;
		}
		for(int i = 0; b > 0; i++) {
			bitArrayB[i] = (int)(b % 2);
			b /= 2;
		}

		//AND
		for(int i = 0; i < 32; i++) {
			System.out.print(bitArrayA[31 - i] * bitArrayB[31 - i]);
		}
		System.out.println();
		//OR
		for(int i = 0; i < 32; i++) {
			if(bitArrayA[31 - i] + bitArrayB[31 - i] > 0) System.out.print(1);
			else System.out.print(0);
		}
		System.out.println();
		//XOR
		for(int i = 0; i < 32; i++) {
			System.out.print((bitArrayA[31 - i] + bitArrayB[31 - i]) % 2);
		}
		System.out.println();
	}

}

