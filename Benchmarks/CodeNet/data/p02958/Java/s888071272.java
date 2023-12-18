import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		Integer N = Integer.parseInt(sn.nextLine());
		String[] Ps = sn.nextLine().split(" ");
		String[] sorted = Arrays.copyOf(Ps, N);
		Arrays.sort(sorted);
		
		if (comp(Ps, sorted) == 0) {
			System.out.println("YES");
			return;
		}
		
		int srcIndex = -1;
		int toIndex = -1;
		for (int i = 0; i < Ps.length; i++) {
			if (Ps[i].equals(sorted[i])) {
				continue;
			}
			srcIndex = i;
			toIndex = getToIndex(Ps[i], sorted);
			break;
		}
		
		String src = Ps[toIndex];
		String to = Ps[srcIndex];
		
		Ps[srcIndex] = src;
		Ps[toIndex] = to;
		
		System.out.println((comp(Ps, sorted) == 0 ? "YES" : "NO"));
	}
	
	private static int comp(String[] Ps, String[] sorted) {
		for (int i = 0; i < Ps.length; i++) {
			if (!Ps[i].equals(sorted[i])) {
				return -1;
			}
		}
		return 0;
	}
	
	private static int getToIndex(String p, String[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			if (sorted[i].equals(p)) {
				return i;
			}
		}
		return -1;
	}
}