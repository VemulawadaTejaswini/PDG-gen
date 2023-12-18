

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sumi = 0;
		int sumi1 = 0;
		int countPlus = 0;
		int countMinus = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		// 奇数がプラス
		for(int i = 0; i < n; i++) {
			sumi1 = sumi + a[i];
			if((i + 1) % 2 == 1) {
				if(sumi1 <= 0) {
					countPlus += Math.abs(sumi1) + 1;
					sumi1 += Math.abs(sumi1) + 1;
				}
			} else if((i + 1) % 2 == 0) {
				if(sumi1 >= 0) {
					countPlus += Math.abs(sumi1) + 1;
					sumi1 -= Math.abs(sumi1) + 1;
				}
			}
			sumi = sumi1;
		}
		sumi = 0;
		sumi1 = 0;
		
		// 奇数がマイナス
		for(int i = 0; i < n; i++) {
			sumi1 = sumi + a[i];
			if((i + 1) % 2 == 1) {
				if(sumi1 >= 0) {
					countMinus += Math.abs(sumi1) + 1;
					sumi1 -= Math.abs(sumi1) + 1;
				}
			} else if((i + 1) % 2 == 0) {
				if(sumi1 <= 0) {
					countMinus += Math.abs(sumi1) + 1;
					sumi1 += Math.abs(sumi1) + 1;
				}
			}
			sumi = sumi1;
		}
		
		if(countPlus < countMinus) {
			System.out.println(countPlus);
		} else {
			System.out.println(countMinus);
		}
		
		scan.close();

	}

}
