import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// https://atcoder.jp/contests/abc164/tasks/abc164_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Set<String> linkedHashSet = new LinkedHashSet<String>();
		for(int i=0;i<n;i++) {
			linkedHashSet.add(sc.next());
		}
		sc.close();

		System.out.println(linkedHashSet.size());

	}
}
