import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		int ans[] = checkS2(S);
		for(int i = 0 ; i < ans.length; i ++) {
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(ans[i]);
		}
		System.out.println();
	}


	public int[] checkS2(String S) {
		int ans[] = new int[S.length()];

		int preRpos = 0 ;
		for(int i = 0 ; i < ans.length ; i ++) {
			ans[i] += 1 ;
			char p = S.charAt(i) ;
			char rev = 0 ;
			if(p == 'R') {
				int idx = S.indexOf('L',i + 1);
				preRpos = i ;

				//偶数回後の移動場所
				int pos = 0  ;
				if((idx - i)%2 == 1) {
					pos = idx - 1;
				}else {
					pos = idx ;
				}
				ans[i] -= 1 ;
				ans[pos] += 1 ;
			}else {
				int idx = preRpos ;

				//偶数回後の移動場所
				int pos = 0  ;
				if((i - idx)%2 == 1) {
					pos = idx + 1;
				}else {
					pos = idx ;
				}
				ans[i] -= 1 ;
				ans[pos] += 1 ;
			}
		}
		return ans ;
	}














	int MODE_R = -1 ;
	int MODE_L = 1 ;
	public int[] checkS(String S) {
		int ans[] = new int[S.length()];

		int mode = MODE_R ;
		int count = 1 ;
		int RCount = 1 ;
		int LCount = 0 ;
		for(int i = 0 ; i < S.length() ; i ++) {
			if(S.charAt(i) == 'R') {
				if(mode == MODE_R) {
					count ++ ;
				}else {
					if(LCount < count) {
						LCount = count ;
					}
					count = 1;
				}
				mode = MODE_R ;
			}else {
				if(mode == MODE_L) {
					count ++ ;
				}else {
					if(RCount < count) {
						RCount = count ;
					}
					count = 1;
				}
				mode = MODE_L ;
			}
		}

		int max = 0 ;
		if(RCount < LCount) {
			max = LCount ;
		}else {
			max = RCount ;
		}

		for( int i = 0 ; i < max ; i ++) {
			for(int j = 0 ; j < S.length() ; j ++) {
			}
		}

		return ans ;
	}
}
