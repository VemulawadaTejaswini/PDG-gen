import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Keta[] keta = new Keta[m];
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			keta[i] = new Keta(s, c);
		}
		sc.close();
		// Mが0の場合
		if(m == 0) {
			// Nが0または1の場合、最小値は0
			if(n == 0 || n == 1) System.out.println(0);
			else System.out.println((int)Math.pow(10, n - 1));
			return;
		}
		// 桁順に並び替える
		Arrays.sort(keta);
		// 桁の最小値
		int min = n > 1 ? (int)Math.pow(10, n - 1) : 0;
		// 条件値の取得
		int k = 0;
		for(int i = 1; i <= n; i++) {
			int check = 0;
			boolean checkF = false;
			for (int j = k; j < m; j++) {
				if(keta[j].S == i) {
					// N > 1の場合、桁1の条件に0が設定されていた場合-1
					if(n > 1 && i == 1 && keta[j].C == 0) {
						System.out.println(-1);
						return;
					}
					// 桁の配列に入力された条件値を取得
					int c = keta[j].C;
					// 条件に同じ桁に対する異なる値が指定されていた場合-1
					if(checkF && check != c) {
						System.out.println(-1);
						return;
					}
					// 1桁目の場合、移行
					if(i == 1) {
						if(n == 1) min = c;
						else min = (int)Math.pow(10, n - i) * c;
					} else {
						// 1桁目以外の場合、加算
						if(n == 1) min += c;
						else min += (int)Math.pow(10, n - i) * c;
					}
					check = c;
					checkF = true;
				} else {
					k = j;
					break;
				}
			}
		}
		System.out.println(min);
	}
}

class Keta implements Comparable<Keta>{
	public int S; 
	public int C;
	public Keta(int S, int C){
		this.S = S;
		this.C = C;
	}
	@Override
	public int compareTo(Keta o) {
		return this.S - o.S;
	}	
}