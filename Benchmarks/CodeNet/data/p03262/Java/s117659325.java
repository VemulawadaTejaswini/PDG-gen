import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] xDifference = new int[n];
		// 整数nの数だけ標準入力
		for(int i = 0; i < n; i++) {
			xDifference[i] = Math.abs(x - sc.nextInt());
		}
		Arrays.sort(xDifference);
		// 整数xとの最小差との剰余が0であるか
		for(int i = 0; i < n; i++) {
			if(xDifference[i] % xDifference[0] != 0) {
				while(true) {
					xDifference[0] = xDifference[0] - 1;
					if(xDifference[i] % xDifference[0] == 0) {
						break;
					}
				}
			}
		}
		System.out.println(xDifference[0]);
		sc.close();
	}
}