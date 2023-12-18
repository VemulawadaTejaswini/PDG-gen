import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int nlen = String.valueOf(n).length();
		int tmp1 = 0;
		int tmp2 = 0;
		int sum = 0;

		for (int i = 1; i <= nlen; i++) {
			for (int j = (int) Math.pow(10, i-1); j < Math.pow(10, i); j++) {
				if (j > n) {
					System.out.println(sum); return;
				} else if (i == 1) {
					tmp1 = j;
					if (tmp1 >= a && tmp1 <= b) {
						sum += j;
					}
				} else if (i == 2) {
					tmp1 = j/10;
					tmp2 = j%10;
					tmp1 += tmp2;
					if (tmp1 >= a && tmp1 <= b) {
						sum += j;
					}
				} else if (i == 3) {
					tmp1 = j/100;
					tmp2 = j%100;
					tmp1 += tmp2/10;
					tmp2 = tmp2%10;
					tmp1 += tmp2;
					if (tmp1 >= a && tmp1 <= b) {
						sum += j;
					}
				} else if (i == 4) {
					tmp1 = j/1000;
					tmp2 = j%1000;
					tmp1 += tmp2/100;
					tmp2 = tmp2%100;
					tmp1 += tmp2/10;
					tmp2 = tmp2%10;
					tmp1 += tmp2;
					if (tmp1 >= a && tmp1 <= b) {
						sum += j;
					}
				} else if (i == 5) {
					if (1 == a && 1 == b) {
						sum += j;
					}
				}
				tmp1 = 0;
				tmp2 = 0;
			}
		}
	}
}