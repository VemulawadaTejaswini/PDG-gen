import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int H = sc.nextInt();
		int W = sc.nextInt();

		int num = 0;

		for(int i = 0; i < H; i++) {
			String A = sc.next();
			for(int j = 0; j < W; j++) {
				char t = A.charAt(j);
				if(t == '#') {
					num++;
				}
			}
		}
		sc.close();
		//設定完了

		String answer = "Impossible";
		if(num == H+W-1) {
			answer = "Possible";
		}
		System.out.println(answer);

	}

}
