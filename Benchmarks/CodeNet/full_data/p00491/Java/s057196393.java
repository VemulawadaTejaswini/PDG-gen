import java.util.Scanner;

public class Main {
	static boolean [] whetherFix_ = new boolean [100];
	static int[] plan_ = new int [100];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0, planNumber;
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		//配列の初期化
		for (int i = 0; i < 100; i++) {
			plan_[i] = 1;
			whetherFix_[i] = false;
			
		}
		
		//予定を入れる。その日のバリエーションは1通りに限られる。
		for (int i = 0; i < K; i++) {
			planNumber = sc.nextInt()-1;
			plan_[planNumber] = sc.nextInt();
			whetherFix_[planNumber] = true;
		}
			
		do{
			//confirm(N);
			if (!continuousFlag(N)) {
				cnt++;
				if (cnt > 10000) {
					cnt /= 10000;
				}
			}
		}while(!trinaryUp(N));
		
		if (!continuousFlag(N)) {
			//confirm(N);
			cnt++;
			if (cnt > 10000) {
				cnt /= 10000;
			}
		}
		
		System.out.println(cnt);

	}
	
	//配列を3進数として1ずつ増加させる関数(ただし1,2,3の数を使う)
	static boolean trinaryUp(int N) {
		int p = N - 1;
		boolean flag = false;
		while (!flag) {
			//予定のある部分(固定値)はないものとみなす
			if (!whetherFix_[p]) {
				if (plan_[p] != 3) {
					plan_[p]++;
					//桁上げ
					for (int q = p + 1; q < N; q++) {
						if (!whetherFix_[q]) {
							plan_[q] = 1;
						}
					}
					flag = true;
				}
			}
			p--;
			if (maxFlag(N)) {
				return true;
			}
		}
		return false;
	}
	
	//3連続している部分があるかどうか
	static boolean continuousFlag(int N){
		for (int i = 0; i < N - 2; i++) {
			if (plan_[i] == plan_[i + 1]) {
				if (plan_[i + 1] == plan_[i + 2]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//固定値以外の値がすべて3か(最大値か)
	static boolean maxFlag(int N){
		boolean flag = true;
		for (int i = 0; i < N; i++) {
			if (!whetherFix_[i] && plan_[i] != 3) {
				flag = false;
			}
		}
		return flag;
	}
	
	//配列確認用
	static void confirm(int N){
		for (int j = 0; j < N; j++) {
			System.out.printf("%d ", plan_[j]);
			
		}
		System.out.println("");
	}
}