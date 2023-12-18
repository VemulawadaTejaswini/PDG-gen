
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		List<Long> que = new ArrayList<>();
		for(int i = 1; i < 10; i++) {
			que.add((long) i);
		}
		for(int i = 0; i < k - 1; i++) {
			long val = que.get(i);
			if(val % 10 != 0)
				que.add(10 * val + val % 10 - 1);
			que.add(10 * val + val % 10);
			if(val % 10 != 9)
				que.add(10 * val + val % 10 + 1);
		}
		System.out.println(que.get(k));

	}

}
