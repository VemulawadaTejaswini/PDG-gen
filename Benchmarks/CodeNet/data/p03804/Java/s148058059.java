import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			String[] nmap = new String[N];
			String[] mmap = new String[M];
			int nwcnt = 0;
			int nbcnt = 0;
			int mwcnt = 0;
			int mbcnt = 0;
			for (int i = 0; i < N; i++) {
				nmap[i] = sc.next();
				for (char c : nmap[i].toCharArray()) {
					if (c == '.') {
						nwcnt++;
					} else {
						nbcnt++;
					}
				}
			}
			for (int i = 0; i < M; i++) {
				mmap[i] = sc.next();
				for (char c : mmap[i].toCharArray()) {
					if (c == '.') {
						mwcnt++;
					} else {
						mbcnt++;
					}
				}
			}

			if (nwcnt < mwcnt || nbcnt < mbcnt) {
				System.out.println("No");
			} else {

				boolean ngflg = true;
				int index = 0;
				try {
					for (int r = 0; r < (N - M) + 1; r++) {
						for (int mr = 0; mr < M; mr++) {
							index = nmap[r].substring(index).indexOf(mmap[mr]);
							if (index < 0 || !nmap[r].substring(index).startsWith(mmap[mr])) {
								break;
							}
							if (mr == M - 1) {
								ngflg = false;
							}
						}
					}

					if (!ngflg) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("No");
				}

			}
		}
	}
}