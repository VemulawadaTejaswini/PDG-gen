import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		
		int[] sosu = {0,1};
		
		int res = 0;

		long josu = 2;
		int sameNumCount = 0; // 同じ数で何回割れたか
		int requiredNumCount = 1; //同じ数で何回割れたら操作可能と判定するか。同じ数で操作できるごとにインクリメント
		while (n != 1) {
			if(n % josu == 0) {
				sameNumCount++;
				n /= josu;
				if(sameNumCount == requiredNumCount) {
					//操作可能！
					res++;
					sameNumCount = 0;
					requiredNumCount++;
				}
				
			} else {
				//次の素数へ、としたいが...
				josu++;
				sameNumCount = 0;
				requiredNumCount = 1;
			}
		}

		System.out.printf("%d", res);
	}
	
}