package _1135;

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class data {
		boolean single;
		double rate;
		int fee;

		data(boolean single, double rate, int fee) {
			this.single = single;
			this.rate = rate;
			this.fee = fee;
		}

		int getCost(int a, int t) {
			if (this.single) {
				int A = a;
				int B = 0; // rishi
				for (int i = 0; i < t; i++) {
					int b2 = (int)(A * rate);
					B += b2;
					A -= fee;
				}
				return A+B;
			} else {
				int A = a;
				for(int i =0 ; i < t;i++){
					int b2 = (int) (A*rate);
					A += b2;
					A -= fee;
				}
				return A;
			}
		}

	}

	void run() {
		int m = sc.nextInt();
		for (int t = 0; t < m; t++) {
			int start = sc.nextInt();
			int year = sc.nextInt();
			int n = sc.nextInt();
			int max = 0;
			for (int u = 0; u < n; u++) {
				data d = new data(sc.nextInt() == 0,sc.nextDouble(),sc.nextInt());
				int cost = d.getCost(start, year);
//				System.out.println(cost);
				max = Math.max(max, cost);
			}
			System.out.println(max);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}