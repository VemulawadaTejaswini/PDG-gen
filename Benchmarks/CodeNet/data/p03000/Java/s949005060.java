

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int X = Integer.parseInt(lines[1]);
		int[] L = new int[N];


		line = sc.nextLine();
		lines = line.split(" ");
		for(int i = 0 ; i < N ; i++) {
			L[i] = Integer.parseInt(lines[i]);
		}

		int count = 1;
		int D = 0;
		for(int i = 0 ; i < N ; i++) {
			D = D + L[i];
			if(D <= X) {
				count++;
			}
		}

		System.out.println(count);

	}

}
