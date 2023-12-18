import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			char[][] nmap = new char[N][N];
			char[][] mmap = new char[M][M];
			int nwcnt = 0;
			int nbcnt = 0;
			int mwcnt = 0;
			int mbcnt = 0;
			for (int i = 0; i < N; i++) {
				nmap[i] = sc.next().toCharArray();
				for (char c : nmap[i]) {
					if (c == '.') {
						nwcnt++;
					} else {
						nbcnt++;
					}
				}
			}
			for (int i = 0; i < M; i++) {
				mmap[i] = sc.next().toCharArray();
				for (char c : mmap[i]) {
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

				boolean ngflg = false;
				boolean okflg = false;
				try {
					for (int r = 0; r < N - M + 1; r++) {
						for (int c = 0; c < N - M + 1; c++) {
							okflg = false;
							ngflg = false;
							for (int mr = 0; mr < M; mr++) {
								for (int mc = 0; mc < M; mc++) {
									if (r + mr >= N || c + mc >= N || nmap[r + mr][c + mc] != mmap[mr][mc]) {
										ngflg = true;
										break;
									}
								}
								if (ngflg) {
									break;
								}
								okflg = true;
							}
						}
					}

					if (okflg) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} catch (Exception e) {
					System.out.println("No");
				}

			}
		}
	}
}
