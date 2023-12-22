package test01;

import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//??\??????W H???
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		
		//?¨????
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				//??????
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}