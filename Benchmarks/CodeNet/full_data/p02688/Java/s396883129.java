import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int member = sc.nextInt();  //すぬけの人数
		int sweet = sc.nextInt();  //お菓子の種類数
		int result = 0;  //いたずらされる人数
		int[] brother = new int[member];  //誰が何個持っているかを入れる箱

//	お菓子1種類ずつ、誰にあげるのか、を考えていく
		for(int i=0 ; i<sweet ; i++) {  //お菓子ごとのループ
			int num = sc.nextInt();  //お菓子の種類数
			for(int j=0 ; j<num ; j++) {  //誰にあげるのかのループ
				int sunuke = sc.nextInt();  //お菓子がもらえるすぬけくんの番号
				brother[sunuke-1] += 1;  //あげるすぬけくんの箱に1を足す
			}
		}
//	箱の中身が0のすぬけくんを見つけて、人数をカウントする
		for(int i=0 ; i<member ; i++) {  //最初から最後まで開けて見てみる
			if(brother[i]==0) {
				result++;
			}
		}
//	箱の中身が0だった人数を表示する
		System.out.print(result);
	}
}