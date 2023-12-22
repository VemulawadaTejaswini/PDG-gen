import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cities = new int[n+1];
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < m; i++) {
			sc.nextLine();
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean flg = false;
			for (List<Integer> l : list) {
				if (l.contains(a)) {
					l.add(b);
					flg = true;
				} else if (l.contains(b)) {
					l.add(a);
					flg =true;
				}
			}
			if (!flg) {
				List<Integer> nn = new ArrayList<Integer>();
				nn.add(a);
				nn.add(b);
				list.add(nn);
			}
			
		}
		System.out.println(list.size() - 1);
	}
}
