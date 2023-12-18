import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();
		long x = 10;
		long num = 0;
		long cnt = 0;

		String temp = null;

		while (true) {
			num++;
			if(isRunRun(num)) {
				cnt++;
			}

			if(cnt == k) {
				break;
			}
		}

		System.out.println(num);

	}

	public static boolean isRunRun(long val) {
		if(val < 10) {
			return true;
		}


		String temp = String.valueOf(val);

		List<Long> list = new ArrayList<>();

		for(char c : temp.toCharArray()) {
			list.add(Long.parseLong(Character.toString(c)));
		}

		long pre = 10;

		for(long l:list) {
			if(pre == 10) {
				pre = l;
				continue;
			}

			if(Math.abs(l-pre) > 1) {
				return false;
			}

			pre = l;

		}

		return true;
	}
}
