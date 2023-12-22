
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String n;
		ArrayList<String> S = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			n = scan.next();
//			if(S.contains(n)==false) {
				S.add(n);
//			}
		}
		 Set<String> linkedHashSet = new LinkedHashSet<String>();

		    // 配列の要素を順にLinkedHashSetオブジェクトへ追加
		    for (int i = 0; i < S.size(); i++) {
		    linkedHashSet.add(S.get(i));
		    }

		    // LinkedHashSetオブジェクトを配列に変換
		    Object[] strings_after = linkedHashSet.toArray();

		    System.out.println(strings_after.length);
//		System.out.println(S.size());

	}
}