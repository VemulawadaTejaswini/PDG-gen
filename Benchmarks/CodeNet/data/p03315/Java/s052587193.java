import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		String s = sc.next();

		String[] sa = s.split("");
		int ans = 0;

		for(int i = 1; i < sa.length; i++){
			if (sa[i].equals("+")) {
				ans++;
			} else {
				ans--;
			}
		}

		// 出力
		System.out.println(ans);
	}
}