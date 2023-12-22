

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// インプットデータ取得
		Scanner sc = new Scanner(System.in);

		while(true) {
			int e=sc.nextInt();
			if(e==0) {break;}

			int x=0;
			int y=0;
			int z=0;
			int xy=0;
			int answer=0;

			//mの三乗根に一番近い整数値をzに入れたい
			for(z=0;;z++) {
				if(z*z*z>=e) {
					xy =e - z*z*z;
					break;
				}
			}
			for(y=0;;y++) {
				if(y*y>=xy) {
					x =e - y*y;
					break;
				}
			}
			answer = x+y+z;
			System.out.println(answer);
		}
	}
}

