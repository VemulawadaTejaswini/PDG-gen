
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> deli = new ArrayList<>();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int K = sc.nextInt();
		long[] xlist = new long[x];
		long[] ylist = new long[y];
		long[] zlist = new long[z];
		for(int i = 0; i < x; i++) {
			xlist[i] = sc.nextLong();
		}
		for(int i = 0; i < y; i++) {
			ylist[i] = sc.nextLong();
		}
		for(int i = 0; i < z; i++) {
			zlist[i] = sc.nextLong();
		}
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				for(int k = 0; k < z; k++) {
					deli.add(xlist[i] + ylist[j] + zlist[k]);
				}
			}
		}
		deli.stream().sorted(Comparator.reverseOrder()).limit(K).forEach(System.out::println);
	}

}
