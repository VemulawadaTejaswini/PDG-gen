import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		List<Long> list = new ArrayList();
		long total = 0L;
		for(long i=1; i<=N; i++) {
			list.add(Long.parseLong(sc.next()));
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(Long a:list) {
			total += a;
		}
		total -= list.get(list.size()-1);
		System.out.println(total);
	}
}