import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ballot = sc.nextInt();  //投票用紙の枚数
		TreeMap<String, Integer> voteMap = new TreeMap<>();

		for(int i=1 ; i<=ballot ; i++) {
			int count;
			String voteName = sc.next();

			if(! voteMap.containsKey(voteName)) {
				count = 1;
				voteMap.put(voteName, count);
			}
			else {
				count = voteMap.get(voteName) + 1;
				voteMap.put(voteName, count);
			}
		}

		List<Integer> valueList = new ArrayList<>(voteMap.values());
		List<String> keyList = new ArrayList<>(voteMap.keySet());
		int voteMax = 0;  //得票数の最大値

		if(valueList.size() == 1) {
			voteMax = valueList.get(0);
		}
		else {
			for(int i=1 ; i<valueList.size() ; i++) {
				voteMax = Math.max(valueList.get(i-1), valueList.get(i));
			}
		}

      	List<Integer> yousoNum = new ArrayList<>();  //最大の得票数を持つ要素番号入れる

		for(int i=0 ; i<valueList.size() ; i++) {
			if(valueList.get(i) == voteMax) {
				yousoNum.add(i);
			}
		}

      	for(int i=0 ; i<yousoNum.size() ; i++) {
			System.out.println(keyList.get(yousoNum.get(i)));
		}
	}
}