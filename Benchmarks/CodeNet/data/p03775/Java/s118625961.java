import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		List<Long> x = new ArrayList<>();
		
		if(N % 2 == 0) {
			for(long i = 1; i <= N / 2; i++) {
				if(N % i == 0) {
					if(x.contains(i)) {
						break;
					} else {
						x.add(i);
						x.add(N / i);
					}
				}
			}
		} else {
			for(long i = 1; i <= (N - 1) / 2 ; i++) {
				if(N % i == 0) {
					if(x.contains(i)) {
						break;
					} else {
						x.add(i);
						x.add(N / i);
					}
				}
			}
		}
		
		int min = 100;
		
		for(Long i : x) {
			String a = String.valueOf(i);
			String b = String.valueOf(N / i);
			int temp = Math.max(a.length(), b.length());
			min = Math.min(min, temp);
		}
		System.out.println(min);
	}
}
