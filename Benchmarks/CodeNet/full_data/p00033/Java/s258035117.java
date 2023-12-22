package com.jack.test;
import java.util.Scanner;

public class Main {

	private static final int N = 12;
	int[] a = new int[N];
	int small = 0;
	int big = 0;
	
	private int s;     //数?的个数
	
	public static void main(String[] args) {
		Main m = new Main();
		m.Sort();
	}
	
	
	private void Sort(){	

		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		
		while(s!= 0){	
			
			for (int i = 1; i <= 10; i++) {
				a[i] = sc.nextInt();
			}
			
			/*for (int m = 1; m <= 10; m++) {
				System.out.print(a[m]+ " ");
			}*/
			
			if (a[1] > a[2]) {
				big = a[1];
				small = a[2];
			}else {
				big = a[2];
				small = a[1];
			}
			//System.out.println(big);
			
			for (int j = 3; j <= 10; j++) {
				if (a[j] > big) {
					big = a[j];
				}
				if (a[j] < big && a[j] > small) {
					small = a[j];
				}
				if (a[j] < small) {
					System.out.printf("NO\n");
					break;
				}
				if (j == 10) {
					System.out.printf("YES\n");
				}
			}
			//System.out.println(s);
			s--;
				
		}
		sc.close();
	}
}