import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * ZAKIREN第5章 4-6.データ構造の応用
 * 
 * @author tdi5277
 *
 */
public class Main {
	/** 入力用 */
	private static Scanner scan = new Scanner(System.in);

	/** 出力用 */
	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 * メイン。
	 * 
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// 読み込み
		String terrain = scan.nextLine();

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算用スタックの宣言
		Stack<Integer> s1 = new Stack<>();
		Stack<Map<Integer, Integer>> s2 = new Stack<>();

		// 文字数分ループ
		int sum = 0;
		for (int i = 0; i < terrain.length(); i++) {
			char target = terrain.charAt(i);
			if (target == '\\') {
				s1.push(i);
			} else if (target == '/' && s1.size() > 0) {
				int j = s1.pop();
				sum += i - j;
				int a = i - j;
				if (s2.size() > 0) {
					Map<Integer, Integer> s2Map = s2.peek();
					Set<Integer> temp = s2Map.keySet();
					Object[] keys = temp.toArray();
					Integer key = (Integer) keys[0];
					while (s2.size() > 0 && key > j) {
						a += s2Map.get(key);
						s2.pop();

						if (s2.size() > 0) {
							s2Map = s2.peek();
							temp = s2Map.keySet();
							keys = temp.toArray();
							key = (Integer) keys[0];
						}
					}
				}
				Map<Integer, Integer> pushS2Map = new HashMap<>();
				pushS2Map.put(j, a);
				s2.push(pushS2Map);
			}
		}

		// 結果出力 合計
		stringBuilder.append(sum + "\n");

		// 結果出力 水たまりの数
		int size = s2.size();
		stringBuilder.append(size);
		
		// 各面積を逆順に並び替える
		Stack<Integer> reverse = new Stack<>();
		while (s2.size() > 0) {
			Map<Integer, Integer> map = s2.pop();
			Set<Integer> temp = map.keySet();
			Object[] keys = temp.toArray();
			Integer key = (Integer) keys[0];
			reverse.push(map.get(key));
		}
		Collections.reverse(new ArrayList<>(reverse));
		
		// 結果出力 各面積
		while (reverse.size() > 0) {
			stringBuilder.append(" " + reverse.pop());
		}

		System.out.println(stringBuilder.toString());

	}

}

