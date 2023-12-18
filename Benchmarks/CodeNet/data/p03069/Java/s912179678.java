import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			String S = sc.next();
			String S2 = new String(S);
			final char w = '.';
			final char b  = '#';
			int count = 0;
			int[] counter = new int[N];
			for(int i = 1; i < N; i++) {
				if(b == S.charAt(i) && S.charAt(i-1) != S.charAt(i)) {
					counter[i] = counter[i -1] + 1;
					char[] ccc = S.toCharArray();
					ccc[i] = w;
					S = new String(ccc);
				}else {
					counter[i] = counter[i -1];
				}
			}

			int[] counter2 = new int[N];
			for(int i = 1; i < N; i++) {
				if(w == S2.charAt(i) && S2.charAt(i-1) != S2.charAt(i)) {
					counter2[i] = counter2[i -1] + 1;
					char[] ccc = S2.toCharArray();
					ccc[i] = b;
					S2 = new String(ccc);
				}else {
					counter2[i] = counter2[i -1];
				}
			}

			System.out.println(Math.min(counter[N -1], counter2[N -1]));
		} // Scanner Close
	}
}