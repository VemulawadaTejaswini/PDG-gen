import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ballot = sc.nextInt();  //投票用紙の枚数
		TreeMap<String, Integer> voteMap = new TreeMap<>();

		//TreeMapに投票された文字と回数を記入
		for(int i=1 ; i<=ballot ; i++) {
			int count;
			String voteName = sc.next();
			//まだ記入されてない文字の場合
			//投票名(voteName)」と「1」を記入
			if(! voteMap.containsKey(voteName)) {
				count = 1;
				voteMap.put(voteName, count);
			}
			//すでに書いてある文字の場合
			//valueを「書いてある数 +1」して上書き
			else {
				count = voteMap.get(voteName) + 1;
				voteMap.put(voteName, count);
			}
		}

		//keyとvalueをそれぞれArrayListに入れて、
		//最も大きいvalueの値を持つ要素番号を求め、
		//その要素番号にあるkeyが答えになる。
		List<Integer> valueList = new ArrayList<>(voteMap.values());
		List<String> keyList = new ArrayList<>(voteMap.keySet());

		int voteMax = 0;  //得票数の最大値

		//得票数の最大値を求める
		if(valueList.size() == 1) {
			voteMax = valueList.get(0);
		}
		else {
			for(int i=1 ; i<valueList.size() ; i++) {
				voteMax = Math.max(valueList.get(i-1), valueList.get(i));
			}
		}

		//valueList内で、voteMaxの値を持つ要素番号をyousoNumに入れる
		List<Integer> yousoNum = new ArrayList<>();  //最大の得票数を持つ要素番号入れる

		for(int i=0 ; i<valueList.size() ; i++) {
			//valueListのi番目の要素とvoteMaxが同じなら、要素番号iをyousoNumに入れる
			if(valueList.get(i) == voteMax) {
				yousoNum.add(i);
			}
		}

		//yousoNumの各要素の値に対応する、keyListの値を表示
		for(int i=0 ; i<yousoNum.size() ; i++) {
			System.out.println(keyList.get(yousoNum.get(i)));
		}
	}
}
