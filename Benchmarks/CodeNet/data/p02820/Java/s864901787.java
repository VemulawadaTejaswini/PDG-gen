import java.util.Scanner;

public class Main {

	private static int play(char st, int rr, int ss, int pp) {
		int ans = 0;
		if(st == 'r') {
			ans = rr;
		}
		if(st == 's') {
			ans = ss;
		}
		if(st == 'p') {
			ans =  pp;
		}
		return ans;
	}

	private static char janc(char st) {
		char ans = 'a';
		if(st == 'r') {
			ans = 'p';
		}
		if(st == 's') {
			ans = 'r';
		}
		if(st == 'p') {
			ans = 's';
		}
		return ans;
	}

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int n = sca.nextInt();
	int k = sca.nextInt();
	int r = sca.nextInt();  // グーで勝った時の点数
	int s = sca.nextInt();  // チョキで勝った時の点数
	int p = sca.nextInt();  // パーで勝った時の点数
	String t = sca.next();
	boolean flg[] = new boolean[n];

	// 処理

	int ans = 0;

	for(int i = 0; i < n; i++) {
		if(i >= k) {
			if(t.charAt(i) == t.charAt(i-k) && flg[i-k] == true) {
				flg[i] = false;
			}
			else{
				ans = ans + play(janc(t.charAt(i)), r, s, p);
				flg[i] = true;
			}
		}
		else {
			if(janc(t.charAt(i)) == 'p') {
				ans = ans + play('p', r, s, p);
			}
			if(janc(t.charAt(i)) == 'r') {
				ans = ans + play('r', r, s, p);
			}
			if(janc(t.charAt(i)) == 's') {
				ans = ans + play('s', r, s, p);
			}
			flg[i] = true;
		}

	}

	// 出力
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}