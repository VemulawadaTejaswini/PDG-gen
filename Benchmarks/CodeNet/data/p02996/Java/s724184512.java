import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> Alist = new ArrayList<>();
		long[] Bs = new long[N];
		List<Long> Blist = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Alist.add(sc.nextLong());
			long bi = sc.nextLong();
			Bs[i] = bi;
			Blist.add(bi);
		}
		sc.close();
		Arrays.sort(Bs);
		long tempSum = 0;
		boolean ans = true;
		for (int i = 0; i < N; i++) {
			long current = Bs[i];
			int numAt = Blist.indexOf(current);
			tempSum = tempSum + Alist.get(numAt);
			if (tempSum > Bs[i]) {
				ans = false;
				break;
			}
			Alist.remove(numAt);
			Blist.remove(numAt);
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
