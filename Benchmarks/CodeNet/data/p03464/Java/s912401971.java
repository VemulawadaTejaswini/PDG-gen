import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long[] ks = new long[k];
		for (int i = 0; i < k; i++) {
			ks[i] = Long.parseLong(sc.next());
		}
		long min = 2;
		if(ks[k-1]!=2) {
			System.out.println(-1);
			return;
		}
		for(int i = k - 2; i >= 0; i--) {
			if(ks[i] >= 2L*min) {
				System.out.println(-1);
				return;
			} else if(ks[i] < min) {
				min = ks[i]* (long)(Math.ceil((double)min/(double)ks[i]));
			} else {
				min = ks[i];
			}
		}
		System.out.println(min+" "+(min+ks[0]-1));
	}
}
