import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String str = sc.next();
		char c[] = str.toCharArray();
		int len = c.length;
		int[] a = new int[len];
		int[] n = new int[len];
		int[] n2 = new int[len];

		/* 配列に読み込み */
		for(int i = 0; i < len; i++) {
			a[i] = c[i] == 'L' ? -1 : 1;
			n[i] = 1;
		}
		
		for(int i = 0; i < ((len % 2 == 0) ? len : len+1); i++) {

			if(i % 2 == 0) {
				for(int j = 0; j < len; j++) {
					n2[j] = 0;
				}

				for(int j = 0; j < len; j++) {
					n2[j+a[j]] += n[j];
				}
			} else {
				for(int j = 0; j < len; j++) {
					n[j] = 0;
				}

				for(int j = 0; j < len; j++) {
					n[j+a[j]] += n2[j];
				}
			}
		}

		for(int i = 0; i < len; i++) {
			System.out.print(n[i]+ " ");
		}

        sc.close();
	}
}