import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(), M = sc.nextInt(), R = sc.nextInt();
		R = R - N * M;
		M = 0;
		if (R <= 0) {
			System.out.println(0);
			return;
		}

		int[] beads = new int[R];

		int count = 0;
		boolean loop = true;
		while (loop) {
			count++;
			//System.out.println(Arrays.toString(beads));
			if (beads[0] < N-1) { // 加算可能
				beads[0] += 1;
			} else {
				boolean flag = false;
				for (int i = 1 ; i < R ; i++) {
					if (beads[i] < N-1) { // i桁目が加算可能
						Arrays.fill(beads, 0, i+1, beads[i]+1);
						flag = true;
						break;
					}
				}
				loop = flag;
			}
		}
		System.out.println(count);
	}
}