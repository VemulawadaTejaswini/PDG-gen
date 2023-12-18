package atCoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		int rMax = n/r;
		int gMax = n/g;
		int bMax = n/b;

		int count = 0;

		for(int i=0;i<rMax;i++) {
			for(int j=0;j<gMax;j++) {
				for(int k=0;k<bMax;k++) {
					if(i*r+j*g+k*b==n) {
						count++;
						break;
					}
				}
			}
		}

		System.out.println(count);
	}
}
