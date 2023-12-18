import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int h = sc.nextInt()-1;
		int w = sc.nextInt()-1;
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;

		long[][] pdp = new long[h+w+1][h+w+1];
		long pow = 1000000007;
		pdp[0][0] = 1;
		for (int x = 1; x <= h+w; x++) {             //組み合わせの数の計算
			for (int k = 0; k <= x; k++) {
				if (k - 1 >= 0) {
					pdp[x][k] = pdp[x-1][k-1] + pdp[x-1][k] % pow;
				} else {
					pdp[x][k] = pdp[x-1][k] % pow;
				}
			}
		}
		
		long ans = (long)pdp[h+w][w];
		
		
		for(int i = 0;i <= b;i++){
			ans -= pdp[h-a-1+ b-i][b-i] * pdp[a + w-b+i][w-b+i] ;	
		
		}
		
		System.out.println(ans);


	}
}