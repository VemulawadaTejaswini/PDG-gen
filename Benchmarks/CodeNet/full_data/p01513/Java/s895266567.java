import java.util.Scanner;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int limit = stdIn.nextInt();
			if(limit == 0) break;
			limit++; //漏洩情報も格納する
			int[][] member = new int[limit][];
			for(int r = 0; r < limit; r++) {//入力
				int num = stdIn.nextInt();
				member[r] = new int[num];
				for(int c = 0; c < num; c++) {
					member[r][c] = stdIn.nextInt();
				}
			}
			int idx = -1;//出力される構成員番号
			int lastLen = member[member.length - 1].length; //漏洩情報の長さ取得が複雑なので変数にする
			boolean complete = false; //見終わった？
			for(int r = 0; r < member.length - 1; r++) {
				boolean[] check = new boolean[lastLen];//数字列のチェック
				boolean flag = false; //見つかった？
				for(int c = 0; c < member[r].length; c++) {
					for(int k = 0; k < lastLen; k++) {//漏洩走査
						if(member[member.length - 1][k] == member[r][c]) {//漏洩情報を持っているならば
							check[k] = true;//持っている事を記憶
						}
					}
				}
				for(int k = 0; k < lastLen; k++) {
					if(!check[k]) {//１個でも、見つからなかった値があったら
						flag = false;//flagをfalseに更新して
						break;//抜け出し
					}
					flag = true;//flagにtrueを入れ続ける
				}
				if(flag) { //もし漏洩情報と構成員の持つ情報が全て一致したら
					if(!complete) {//終わってないなら
						idx = r + 1;//構成員番号を登録
						complete = true; //終わった事を保持
					} else { //もう終わってるならば
						idx = -1;//2人以上の構成員が持つ事を許さないので-1に更新
					}
				}
			}
			System.out.println(idx);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}