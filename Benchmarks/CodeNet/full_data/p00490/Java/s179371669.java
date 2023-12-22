import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, bc = 0, bp, tp, tcnt = 1;
		n = sc.nextInt();
		int[] tcal = new int[n];
		bp = sc.nextInt();
		tp = sc.nextInt();
		bc = sc.nextInt();
		for(i = 0; i < n; i++) tcal[i] = sc.nextInt();
		int sump = bp; int sumc = bc;
		int best = sumc / sump;
		Arrays.sort(tcal);
		for(i = n-1; i >= 0; i--) {
			sumc += tcal[i];
			sump = bp + tp*tcnt;
			tcnt++;
			int dpc = sumc / sump;
			System.out.printf("%d %d %d\n",sump, sumc, dpc);
			if(best < dpc) best = dpc;
			else if(i != n-1)break;
		}
		System.out.println(best);
	}
}