package contest083;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		
		int count = 0;
		for(int i = 1; i <= N; i++) {
			if(i <= 9) {
				if((A <= i) && (i <= B)) {
					count += i;
				}
			}else if((10 <= i) && (i < 100)) {
				int tmp1 = i / 10;
				int tmp2 = i % 10;
				int tmp = tmp1 + tmp2;
				if((A <= tmp) && (tmp <= B)) {
					count += i;
				}
			}else if((100 <= i) && (i < 1000)) {
				int tmp1 = i / 100;
				int tmp1_1 = i % 100;
				int tmp2 = tmp1_1 / 10;
				int tmp2_2 = tmp1_1 % 10;
				int tmp = tmp1 + tmp2 + tmp2_2;
				if((A <= tmp) && (tmp <= B)) {
					count += i;
				}
			}else if((1000 <= i) && (i < 10000)) {
				int tmp1 = i / 1000;
				int tmp1_1 = i % 1000;
				int tmp2 = tmp1_1 / 100;
				int tmp2_2 = tmp1_1 % 100;
				int tmp3 = tmp2_2 / 10;
				int tmp3_3 = tmp2_2 % 10;
				int tmp = tmp1 + tmp2 + tmp3 + tmp3_3;
				if((A <= tmp) && (tmp <= B)) {
					count += i;
				}
			}else {
				if((A <= i) && (i <= B)) {
					count += i;
				}
			}
		}
		System.out.println(count);
	}
}
