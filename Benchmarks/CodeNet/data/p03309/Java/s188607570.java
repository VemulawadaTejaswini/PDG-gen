
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> plus = new ArrayList<>();
		List<Long> minus = new ArrayList<>();
		long zero = 0;
		for(int i = 1; i < n + 1; i++) {
			long tmp = sc.nextLong() - i;
			if(tmp > 0) {
				plus.add(tmp);
			} else if(tmp == 0) {
				zero++;
			} else {
				minus.add(-tmp);
			}
		}
		while((zero < minus.size() || zero < plus.size()) && plus.size() != minus.size()) {
			Collections.sort(plus);
			Collections.sort(minus);
			if(plus.size() > minus.size()) {
				long tmp = plus.get(0);
				for(Long e : plus) {
					e -= tmp;
				}
				for(Long e : minus) {
					e += tmp;
				}
				for(long i = 0; i < zero; i++) {
					minus.add(tmp);
				}
				zero = 0;
				for(Long e : plus) {
					if(e == 0)
						zero++;
				}
				plus.removeIf(e -> e == 0);
			} else {
				long tmp = minus.get(0);
				for(Long e : minus) {
					e -= tmp;
				}
				for(Long e : minus) {
					e += tmp;
				}
				for(long i = 0; i < zero; i++) {
					plus.add(tmp);
				}
				zero = 0;
				for(Long e : minus) {
					if(e == 0)
						zero++;
				}
				minus.removeIf(e -> e == 0);
			}
		}
		long ans = 0;
		for(Long e : plus) {
			ans += e;
		}
		for(Long e : minus) {
			ans += e;
		}
		System.out.println(ans);
	}

}
