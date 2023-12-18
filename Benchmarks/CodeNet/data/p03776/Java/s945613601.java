import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //個数
		int A = scanner.nextInt(); //A < m < B  ; m個のものを選ぶ
		int B = scanner.nextInt();
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextLong());
		}
		Collections.sort(list);
		Collections.reverse(list);
		long sum = 0;
		for (int i = 0; i < A; i++) {
			sum += list.get(i);
		}
		double k = ((double) sum) / A;
		System.out.printf("%.6f\n", k);
		long a = list.get(A - 1);

		// おんなじ数字がいくつあるか
		int count = (int) list.stream().filter(e -> e == a).count();
		int first = 0;
		for (int i = 0; i < N; i++) {
			if (a == list.get(i)) {
				first = i;
				break;
			}
		}
		if (first == 0) {
			long total = 0;
			//int last = count > B ? B : count;
			int last = B;
			
			for (int i = A; i <= last; i++) {
				total += aCb(count, i);
			}
			System.out.println(total);
		}else {
			//含まれている数
			int h = A - first + 1;
			System.out.println(aCb(count, count - h));
		}
	}
	
	public static long aCb(int a, int b){
		long ans = 1;
		for (int i = 0; i < b; i++) {
			ans = ans * (a - i) / (i + 1);
		}
		return ans;
	}
}