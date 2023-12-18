import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int[] count = new int[26];
		for (int i = 0; i < H; i++) {
			String str = in.next();
			for (int j = 0; j < W; j++) {
				count[str.charAt(j)-'a'] ++;
			}
		}
		
		boolean ans = true;
		int safe2 = 0;
		int safe1 = 0;
		if(H%2 == 1) {
			if(W%2 == 1) {
				safe1 = 1;
				safe2 = H + W -2;
			}else {
				safe2 = W;
			}
		}else{
			if(W%2 == 1) {
				safe2 = H;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			count[i] = count[i] % 4;
			if(count[i] == 0) continue;
			if(count[i] == 1) safe1 --;
			if(count[i] == 2) safe2 -= 2;
			if(count[i] == 3 || safe1<0 || safe2<0) {
				ans = false;
				break;
			}
		}
		System.out.println(ans? "Yes":"No");
		
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}