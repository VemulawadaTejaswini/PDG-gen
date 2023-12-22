import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();//整数の数
		int cnt = 0;
		boolean flag = false;
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < a; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		for (int i = 0; i < a; i++) {
			flag = false;
			int b = list.get(i);
			for (int j = 0; j < a; j++) {
				if (j == i) {
					continue;
				}
				int c = list.get(j);
				if (b <= c) {
					break;
				}
				if (b % c == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}