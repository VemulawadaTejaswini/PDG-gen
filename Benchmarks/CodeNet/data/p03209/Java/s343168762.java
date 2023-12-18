import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //整数の入力
		int x = sc.nextInt();
		List<int> list = new ArrayList<int>();
		list.add(1);
		for (int i = 0; i < n; i++) {
			List<int> tmp = new ArrayList<int>();
			tmp.add(0);
			tmp.addAll(list);
			tmp.add(1);
			tmp.addAll(list);
			tmp.add(0);
			list = tmp;
		}
		int total = 0;
		for (int i = 0; i < x; i++) {
			total += list.get(n - i - 1);
		}
		System.out.println(total);
	}
}