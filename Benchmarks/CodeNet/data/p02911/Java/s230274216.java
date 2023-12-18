import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();  //参加者数
		int point = sc.nextInt();  //ポイント
		int questions = sc.nextInt();  //問題数
		int winner[] = new int[questions];  //問題ごとに正解した人の番号

		//問題ごとに正解した参加者の番号を代入
		for(int i : winner) {
			winner[i] = sc.nextInt();
		}

		//「要素番号=参加者番号」の配列に得点を入れる
		int result[] = new int[participants];
		for(int i : result) {
			result[i] = point;
		}

		//問題ごとに正解してない参加者番号の人のポイントから-1
		for(int i : winner) {
			for(int j : result) {
				if(winner[i] != j) {
					result[j] -=1;
				}
			}
		}
		for(int i : result) {
		System.out.println(result[i] > 0 ? "Yes" : "No");
		}
		sc.close();
	}
}