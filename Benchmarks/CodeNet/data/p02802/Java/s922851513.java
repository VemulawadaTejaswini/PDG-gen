import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[] clear = new boolean[N];
		int[] wa = new int[N];
		long waCnt = 0;
		int ac = 0;
		
		for (int i=0; i<M; i++) {
			int p = sc.nextInt() - 1;
			String S = sc.next();
			if (!clear[p]) {
				if (S.equals("AC")) {
					clear[p] = true;
					ac++;
					waCnt += wa[p];
				}
				else {
					wa[p]++;
				}
			}
		}
		
		System.out.println(ac + " " + waCnt);
	}
}