import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Lmax = 0, Rmin = Integer.MAX_VALUE;
		for(int i = 0; i < M; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			Lmax = Math.max(Lmax, L);
			Rmin = Math.min(Rmin, R);
		}
		System.out.println(Rmin-Lmax >= 0 ? Rmin-Lmax+1 : 0);
	}

}
