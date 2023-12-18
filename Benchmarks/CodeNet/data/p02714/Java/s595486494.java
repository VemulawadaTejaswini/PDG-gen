import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();
		sc.nextLine();
		String s = sc.nextLine();

		long cnt = 0;

		for (int ai = 1; ai <= k; ai++) {
			for (int bi = ai+1; bi <= k; bi++) {
				for (int ci = bi+1; ci <= k; ci++) {
					if(bi - ai != ci - bi && ai < bi && bi < ci) {
						if(s.charAt(ai-1) != s.charAt(bi-1) && s.charAt(bi-1) != s.charAt(ci-1) && s.charAt(ai-1) != s.charAt(ci-1)) {
							cnt++;
						}
					}
				}
			}
		}

		System.out.println(cnt);
	}

}
