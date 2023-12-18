import java.util.Scanner;

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
			boolean odd = false;
			for(String hoge : splited) {
				if(pre == null) {
					pre = hoge;
				} else if(pre.equals(hoge)) {
					num++;
				} else {
					if(top && num % 2 != 0 && num != 1) {
						odd = true;
					}
					top = false;
					ans += (int)Math.floor(num / 2d);
					num = 1;
					pre = hoge;
				}
			}
			if(top && num % 2 != 0 && num != 1) {
				odd = true;
			}
			ans += (int)Math.floor(num / 2d);
			if(first.equals(end) && odd) ans++;
			long finalAns = ans * k;
			if(first.equals(end) && odd) finalAns -= (k / 2 + 1);
			System.out.println(finalAns);
		}

	}

}
