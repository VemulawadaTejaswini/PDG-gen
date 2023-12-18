import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();


		List<Long> list = new ArrayList<Long>();

		for (long l = 1; l < n; l++) {
			list.add(sc.nextLong());
		}

		for (long l = 1; l <= n; l++) {
			System.out.println(cnt(list,l));
		}

	}

	public static long cnt(List<Long> list,long num) {

		long cnt = 0;

		for(long x:list) {
			if(num == x) {
				cnt++;
			}
		}

		return cnt;
	}

}
