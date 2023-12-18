import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// https://atcoder.jp/contests/abc155/tasks/abc155_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[3];
		Scanner sc = new Scanner(System.in);
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
		sc.close();

		// LinkedHashSetオブジェクトを用意
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		// 配列の要素を順にLinkedHashSetオブジェクトへ追加
		for (int i = 0; i < array.length; i++) {
			linkedHashSet.add(array[i]);
			}
		if(linkedHashSet.size()==2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
