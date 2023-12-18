import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder s = new StringBuilder(sc.next());
		StringBuilder t = new StringBuilder(sc.next());
		sc.close();
		
		int snum = 0;

		int sindex = s.indexOf(t.substring(0, 1));
		
		if (sindex == -1) {
			System.out.println(N*2);
			System.exit(0);
		} else {
			sindex++;
		}

		for (int i = 1; sindex < N; i++, sindex++) {
			if (s.substring(sindex, sindex+1).equals(t.substring(i, i+1))){
			} else {
				break;
			}
			if (sindex == N -1) {
				snum = N - s.indexOf(t.substring(0, 1));
			}
		}


		System.out.println(N * 2 - snum);

	}
}