import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc166/tasks/abc166_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();


		String[] array = new String[n];
		for(int i=0;i<n;i++){
			array[i]="hoge";
		}

		for(int i=0;i<k;i++) {
			int d = sc.nextInt();
			for(int j=0;j<d;j++) {
				int flag = sc.nextInt();
				array[flag-1] = "aa";
			}
		}
		sc.close();

		List<String> list = new ArrayList<>(Arrays.asList(array));
		List<String> set = new ArrayList<>();
        Collections.addAll(set, "hoge");
		list.removeAll(set);
		list.size();
		System.out.println(n-list.size());




	}
}
