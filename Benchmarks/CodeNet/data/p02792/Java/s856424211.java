import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[][] c = new int[10][10];//c[t][b]は，1~nの数の中で,先頭の数字がtで末尾の数字がbであるような数

		for(int t = 0; t < 10; t++) {
			for(int b = 0; b < 10; b++) {
				int cnt = 0;
				for(int k = 1; k < n+1; k++) {
					String strk = String.valueOf(k);
					String strt = String.valueOf(t);
					String strb = String.valueOf(b);
					if(strk.charAt(0) == strt.charAt(0) && strk.charAt(strk.length()-1) == strb.charAt(0) ) {
						cnt++;
					}
				}

				c[t][b] = cnt;
			}
		}

		//こたえ
		int sum = 0;
		for(int t = 0; t < 10; t++) {
			for(int b = 0; b < 10; b++) {
				sum += c[t][b] * c[b][t];
			}
		}

		System.out.println(sum);
	}
}
