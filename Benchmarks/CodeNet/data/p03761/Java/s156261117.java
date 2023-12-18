
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//文字列の個数
		int N = scan.nextInt();
		//文字列ごとに配列に入れる、文字列の個数分の配列ができる
		String[] L = new String[N];
		//文字列の個数の回数だけ取得する
		for(int i=0;i<N;i++) {
			L[i] = scan.next();
		}
		scan.close();

		//各文字列ごとに処理を行う、一文字ずつ取得して配列に入れ、MAP化する
		//MAP化した値を格納するためのリストを準備
		List<Map> ListL = new ArrayList<Map>();

		//文字列を一つ取得
		for(String str:L) {
			//文字列から取得した文字を格納するMAPを準備
			Map<String, Integer> map = new TreeMap<String, Integer>();
			//文字列を一文字ずつ分割してMAPに格納
			for(int i=0;i<str.length();i++) {
				String word =  String.valueOf(str.charAt(i));
				//もしキーに登録されていない文字が渡された場合
				if(map.get(word)==null) {
					//出現回数1回目でMAPに登録
					map.put(word,1);
					//すでにMAPに登録されている場合
				}else if (map.get(word)!=null) {
					//現在の出現数を取得
					int count = map.get(word);
					//今回の出現分を足す
					map.put(word, count+1);
				}
			}
			//一つの取得した文字列の文字分類が完了したら、分類結果をリストに登録する
			ListL.add(map);
		}

		//各MAPごとのキーの一致を比較、すべてのMAPで使用されているキーを取得
		//最初の文字列に使用されている文字、
		//兼、一致文字一覧用のリスト
		//一致しない文字をループで排除していくため、初期値は最初の文字列を採用
		Set<String> matchL = ListL.get(0).keySet();

		for(int i=1;i<N;i++) {
			//比較対象文字列の文字一覧格納用
			Set<String> diffL = ListL.get(i).keySet();
			//一致した文字の一時格納用
			List<String> tempL = new ArrayList<String>();
			//現段階で一致している文字の一覧と
			for(String diffA:matchL) {
				//未確認の文字の一覧を
				for(String diffB:diffL) {
					//比較して一致しているものがあれば
					if(diffA.equals(diffB)) {
						//一時一致リストに追加する
						tempL.add(diffA);
					}
				}
			}
			//比較が終わるごとに一致した文字を上書きする
			matchL = new HashSet<String>(tempL);
			//次のリストの値を入れるため、リセット
			diffL = null;

		}
;
		String resultL = "";

		//取得したキーの使用回数の最小値を取得
		//ループで該当文字の回数をリストから順に取得し、minである方を採用
		for(String str:matchL) {
			int strC = 0;
			for(Map<String, Integer> count:ListL) {
				int tempC = 0;
				tempC = count.get(str);
				if(strC==0 || tempC<strC) {
					strC = tempC;
				}
			}

			//最大値の数ずつキーを並べた文字列を作成、表示
			for(int i = 0;i<strC;i++) {
			resultL = resultL + str;
			}
		}

		System.out.println(resultL);

	}
}