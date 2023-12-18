import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}
		scan.close();

		int bit = 1 << n;
		int[][] dp = new int[bit][n];	//そのbitで，最後に立ったbitがnの時の転置数
		int[] cdn = new int[bit];	//各bitの1が立ってる数
		cdn[0] = 0;
		for(int i = 1; i < bit; i++) {	//cdnを計算
			cdn[i] = cdn[i&(i-1)] + 1;
		}


		for(int i = 1; i < bit; i++) {

			for(int j = 0; j < n; j++) {
				if((i>>j) % 2 != 0) {	//j番目が入ってるなら，j番目を0にしたやつの手間
					int bitj = i - (1<<j); 	//(bit)iのj番目を0にしたbit
					int min = Integer.MAX_VALUE;
					for(int k = 0; k < n; k++) {	//bitjに最後に入れたのがkだったときの転置数（の最小値）

						if(dp[bitj][k] < Integer.MAX_VALUE) {	//kを最後に入れたのがイケてたら，
							int prev = 0;	//前に入れたカードkの表の番号
							if((cdn[bitj]-1-k) % 2 == 0) { //前に入れたkは(cdn[bitj]-1)番目にあるので，
								prev = a[k];
							}else {
								prev = b[k];
							}
							int pres = 0; //今回入れるカードjの表の番号
							if((cdn[i]-1-j) % 2 == 0) {
								pres = a[j];
							}else {
								pres = b[j];
							}
							if(prev <= pres) {
								int temp = dp[bitj][k] + Math.abs(cdn[i]-1-j);
								if(temp < min) {
									min = temp;
								}
							}
						}
					}
					if(cdn[i] <= 1) {
						dp[i][j] = Math.abs(j);
					}else {
						dp[i][j] = min;
					}
				}else {	//j番目が入ってないならdpはinfinity
					dp[i][j] = Integer.MAX_VALUE;
				}
			}

		}



		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			int temp = dp[bit-1][i];
			if(min > temp) {
				min = temp;
			}
		}

		if(min >= Integer.MAX_VALUE) {
			min = -1;
		}else {
			min /= 2;
		}

		System.out.println(min);


		

	}



}