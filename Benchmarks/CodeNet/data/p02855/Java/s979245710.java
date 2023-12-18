import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int w = scan.nextInt();
		int k = scan.nextInt();

		char[][] s = new char[h+1][w+1];
		int[][] a = new int[h+1][w+1];

		for(int i = 1; i < h+1; i++) {
			String tmp = scan.next();
			for(int j = 1; j < w+1; j++) {
				s[i][j] = tmp.charAt(j-1);
			}
		}


		int cs = 0;	//何番目のイチゴの領域か
		boolean[] raws = new boolean[h+1];	//その行で既にイチゴに出会ったか

		for(int i = 1; i < h+1; i++) {
			raws[i] = false;

			for(int j = 1; j < w+1; j++) {
				if(s[i][j] == '#') {
					cs++;
					if(!raws[i]) {
						int p = 1;
						while(p < j) {
							a[i][p] = cs;
							p++;
						}
						raws[i] = true;
					}
				}

				if(raws[i]) {
					a[i][j] = cs;
				}
			}
		}

		//イチゴが無い行の領域分け
		int first = 0;	//最初にイチゴがある行
		int index = 1;
		while(first < 1) {
			if(raws[index]) {
				first = index;
			}
			index++;
		}


		for(int i = first-1; i > 0; i--) {//まずfirstより↑をうめる
			for(int j = 1; j < w+1; j++) {
				a[i][j] = a[i+1][j];
			}
		}

		for(int i = first+1; i < h+1; i++) {
			if(!raws[i]) {
				for(int j = 1; j < w+1; j++) {
					a[i][j] = a[i-1][j];
				}
			}
		}

		for(int i = 1; i < h+1; i++) {
			for(int j = 1; j < w+1; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
