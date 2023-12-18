package test;

import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner (System.in);

		int height = scanner.nextInt();
		int width = scanner.nextInt();
		int heightNum = scanner.nextInt();
		int widthNum = scanner.nextInt();

		char[][] hyou = new char [height][width];

		for (int index=0; index<height; index++) {
			for (int index2=0; index2<width; index2++) {
				hyou[index][index2]='o';
			}
		}

		for (int index=0; index<heightNum; index++) {
			for (int index2=0; index2<width; index2++) {
				hyou[index][index2]='x';
			}
		}

		for (int index=0; index<widthNum; index++) {
			for (int index2=0; index2<height; index2++) {
				hyou[index2][index]='x';
			}
		}
		int count=0;

		for (int index=0; index<height; index++) {
			for (int index2=0; index2<width; index2++) {
				if (hyou[index][index2]=='o') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}