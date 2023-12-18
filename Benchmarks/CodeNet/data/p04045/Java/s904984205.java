
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		int[] D = new int[K];
		int m = 10 - K;
		int[] S = new int[m];
		int a = 0;

		String[] s = br.readLine().split(" ");

		for (int i = 0; i < K; i++) {
			if (D[i] <= 9 && 0 <= D[i]) {
				D[i] = Integer.parseInt(s[i]);
			}
		}

		for (int i = 0; i < 10; i++) {
			int c = 0;
			for (int j = 0; j < K; j++) {
				// D[j]が0～9のどれにも当てはまらなかったら、c++する

				if (D[j] == i) {
					// なにもしない
				} else {
					c++;
				}

				// D[j]が0～9の全てに当てはまらなかったら、iの値をS[a]に代入する。
				if (c == K) {
					S[a] = i;
					a++;
				}

				else {
					// なにもしない
				}

			}

		}

		int[] w = new int[1];
		int[] x = new int[1];
		int[] y = new int[1];
		int[] z = new int[1];

		LOOP1: for (int i = 0; i < S.length; i++) {
			for (int j = 0; j < S.length - 1; j++) {
				w[0] = S[0];
				x[0] = S[0];
				y[0] = S[0];
				z[0] = S[0];

				z[0] = S[j + 1];
				String q = w[0] + "" + x[0] + "" + y[0] + "" + z[0];
				int num = Integer.parseInt(q);
				if (num >= N) {
					System.out.print(num);
					break LOOP1;
				}
			}

			for (int j = 0; j < S.length - 1; j++) {
				w[0] = S[0];
				x[0] = S[0];
				y[0] = S[0];
				z[0] = S[0];

				y[0] = S[j + 1];
				String q = w[0] + "" + x[0] + "" + y[0] + "" + z[0];
				int num = Integer.parseInt(q);
				if (num >= N) {
					System.out.print(num);
					break LOOP1;
				} else {
					z[0] = S[j + 1];
					if (num >= N) {
						System.out.print(num);
						break LOOP1;
					}
				}
			}

			for (int j = 0; j < S.length - 1; j++) {
				w[0] = S[0];
				x[0] = S[0];
				y[0] = S[0];
				z[0] = S[0];

				x[0] = S[j + 1];
				String q = w[0] + "" + x[0] + "" + y[0] + "" + z[0];
				int num = Integer.parseInt(q);
				if (num >= N) {
					System.out.print(num);
					break LOOP1;
				} else {
					z[0] = S[j + 1];
					if (num >= N) {
						System.out.print(num);
						break LOOP1;
					} else {
						z[0] = S[j];
						y[0] = S[j + 1];
						if (num >= N) {
							System.out.print(num);
							break LOOP1;
						} else {
							z[0] = S[j + 1];
							y[0] = S[j + 1];
							if (num >= N) {
								System.out.print(num);
								break LOOP1;
							}
						}
					}
				}
			}

			for (int j = 0; j < S.length - 1; j++) {
				w[0] = S[0];
				x[0] = S[0];
				y[0] = S[0];
				z[0] = S[0];

				w[0] = S[j + 1];
				String q = w[0] + "" + x[0] + "" + y[0] + "" + z[0];
				int num = Integer.parseInt(q);
				if (num >= N) {
					System.out.print(num);
					break LOOP1;
				} else {
					z[0] = S[j + 1];
					if (num >= N) {
						System.out.print(num);
						break LOOP1;
					} else {
						z[0] = S[j];
						y[0] = S[j + 1];
						if (num >= N) {
							System.out.print(num);
							break LOOP1;
						} else {
							z[0] = S[j + 1];
							y[0] = S[j + 1];
							if (num >= N) {
								System.out.print(num);
								break LOOP1;
							} else {
								z[0] = S[j];
								y[0] = S[j];
								x[0] = S[j + 1];
								if (num >= N) {
									System.out.print(num);
									break LOOP1;
								} else {
									z[0] = S[j + 1];
									y[0] = S[j];
									x[0] = S[j + 1];
									if (num >= N) {
										System.out.print(num);
										break LOOP1;
									} else {
										z[0] = S[j];
										y[0] = S[j + 1];
										x[0] = S[j + 1];
										if (num >= N) {
											System.out.print(num);
											break LOOP1;
										} else {
											z[0] = S[j + 1];
											y[0] = S[j + 1];
											x[0] = S[j + 1];
											if (num >= N) {
												System.out.print(num);
												break LOOP1;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
