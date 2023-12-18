import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();  //参加者数
		int point = sc.nextInt();  //ポイント
		int questions = sc.nextInt();  //問題数
		int winner[] = new int[questions];  //問題ごとに正解した人の番号

		//問題ごとに正解した参加者の番号を代入
		for(int i=0 ; i<questions ; i++) {
			winner[i] = sc.nextInt();
		}

		//「要素番号 = 参加者番号-1」の配列に得点を入れる
		int result[] = new int[participants];
		for(int i=0 ; i<participants ; i++) {
			result[i] = point;
		}

		//正解してない参加者番号の人のポイントを-1
		for(int i : winner) {
			for(int j=0 ; j<participants ; j++) {
				if(i-1 != j) {  //「i = 要素の中身の値」だから「-1」する
					result[j] = result[j]-1;
				}
			}
		}
		for(int i : result) {
		System.out.println(i > 0 ? "Yes" : "No");
		}
		sc.close();
	}
}
