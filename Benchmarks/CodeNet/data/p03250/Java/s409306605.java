import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author k
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<Integer>();
		// 標準入力より読み取りリストに追加
		inputList.add(sc.nextInt());// 入力A
		inputList.add(sc.nextInt());// 入力B
		inputList.add(sc.nextInt());// 入力C
		// 最大値を取得
		Integer maxNum = Collections.max(inputList);
		inputList.remove(maxNum);
		// 2番目に大きい値を取得
		Integer midNum = Collections.max(inputList);
		inputList.remove(midNum);
		// 結果出力
		System.out.println(maxNum.intValue() * 10 + midNum.intValue() + inputList.get(0).intValue());

		sc.close();
	}

}