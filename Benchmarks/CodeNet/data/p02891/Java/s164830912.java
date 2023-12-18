import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int k = sc.nextInt();
			String[] splited = s.split("");
			int num = 1;
			long ans = 0;
			String pre = null;
			String first = s.substring(0, 1);
			String end = s.substring(s.length() - 1, s.length());
			boolean top = true;
			Set<String> set = new HashSet<>();
			int topNum = 1;
			int bottomNum = 1;
			for(String hoge : splited) {
				set.add(hoge);
				if(pre == null) {
					pre = hoge;
				} else if(pre.equals(hoge)) {
					num++;
				} else {
					if(top) {
						topNum = num;
					}
					top = false;
					if(!first.equals(end)) ans += num / 2;
					num = 1;
					pre = hoge;
				}
			}
			bottomNum = num;
			if(set.size() == 1) {
				System.out.println(s.length() * k / 2);
				return;
			}
			if(!first.equals(end)) {
				System.out.println(ans * k);
				return;
			}
			System.out.println(topNum / 2 + ((topNum + bottomNum) * (k - 1) / 2) + bottomNum / 2);
		}

	}

}
