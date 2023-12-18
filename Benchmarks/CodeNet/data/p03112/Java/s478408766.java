import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		TreeSet<Long> sh = new TreeSet<>();
		for (int i = 0; i < a; i++) {
			sh.add(sc.nextLong());
		}
		TreeSet<Long> tm = new TreeSet<>();
		for (int i = 0; i < b; i++) {
			tm.add(sc.nextLong());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			long x = sc.nextLong();
			Long leftSH = sh.floor(x);
			Long leftTM = tm.floor(x);
			Long rightSH = sh.ceiling(x);
			Long rightTM = tm.ceiling(x);
			long min = Long.MAX_VALUE;
			if (leftSH != null) {
				if (leftTM != null) {
					min = Math.min(min, x - Math.min(leftSH.longValue(), leftTM.longValue()));
				}
				if (rightTM != null) {
					min = Math.min(min, rightTM.longValue() - leftSH.longValue() + Math.min(x - leftSH.longValue(), rightTM.longValue() - x));
				}
			}
			if (rightSH != null) {
				if (leftTM != null) {
					min = Math.min(min, rightSH.longValue() - leftTM.longValue() + Math.min(x - leftTM.longValue(), rightSH.longValue() - x));
				}
				if (rightTM != null) {
					min = Math.min(min, Math.max(rightSH.longValue(), rightTM.longValue()) - x);
				}
			}
			sb.append(min).append("\n");
		}
		System.out.print(sb);
	}
}
