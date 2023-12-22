import java.util.BitSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	int[][][][] getOpe(int n) {
		int ret[][][][] = new int[n][n][n][n];

		int di[] = { 1, 1, 1, 0, 0, 0, -1, -1, -1 };
		int dj[] = { 1, 0, -1, 1, 0, -1, 1, 0, -1 };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int z = 0; z < 9; z++) {
					int ni = i + di[z];
					int nj = j + dj[z];
					ni = (ni+n) % n;
					nj = (nj+n) % n;

					ret[i][j][ni][nj] = 1;
				}
			}
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	void run() {
		for (;;) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			int data[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					data[i][j] = sc.nextInt();
				}
			}

			int[][][][] ope = getOpe(n);

			int opp[][][][] = new int[n][n][n][n];
			int res[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					opp[i][j][i][j] = 1;
				}
			}

			boolean bk = false;
			int i2 = 0;
			int j2 = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (data[i][j] != 0) {
						int ooi = -1;
						int ooj = -1;

						for (int oi = i2; oi < n; oi++) {
							for (int oj = j2; oj < n; oj++) {
								if (ope[oi][oj][i][j] != 0) {
									ooi = oi;
									ooj = oj;
								}
							}
						}
						
						
						if (ooi == -1) {
//							System.out.println(i+","+j);
//							continue;
							bk = true;
							break;
						}

						
						for(int si = 0; si < n; si++){
							for(int sj = 0; sj < n ; sj++){
								int sw = ope[ooi][ooj][si][sj];
								ope[ooi][ooj][si][sj] = ope[i2][j2][si][sj];
								ope[i2][j2][si][sj] = sw;
								
								sw = opp[ooi][ooj][si][sj];
								opp[ooi][ooj][si][sj] = opp[i2][j2][si][sj];
								opp[i2][j2][si][sj] = sw;
								
							}
						}
						
						
						ooi = i2;
						ooj = j2;
						
						j2++;
						if(j2 == n){
							i2++;
							j2 =0 ;
						}
						
						for (int zi = 0; zi < n; zi++) {
							for (int zj = 0; zj < n; zj++) {
								data[zi][zj] -= ope[ooi][ooj][zi][zj]
										* data[i][j];
								res[zi][zj] += opp[ooi][ooj][zi][zj] * data[i][j];
								res[zi][zj] %= 7;
							}
						}

						for (int nei = 0; nei < n; nei++) {
							for (int nej = 0; nej < n; nej++) {
								if (nei == ooi && nej == ooj) {
									continue;
								}

								if (ope[nei][nej][i][j] != 0) {
									for (int zi = 0; zi < n; zi++) {
										for (int zj = 0; zj < n; zj++) {
											opp[nei][nej][zi][zj] -= opp[ooi][ooj][zi][zj]
													* ope[nei][nej][i][j];
											opp[nei][nej][zi][zj] = (opp[nei][nej][zi][zj] + 7) % 7;
											ope[nei][nej][zi][zj] -= ope[ooi][ooj][zi][zj]
													* ope[nei][nej][i][j];
											ope[nei][nej][zi][zj] = (ope[nei][nej][zi][zj] + 7) % 7;
										}
									}
								}
							}
						}
					}
				}
				if (bk) {
					break;
				}
			}
			if (bk) {
				System.out.println(-1);
				System.out.println();
			} else {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (j != 0) {
							System.out.print(" ");
						}
						System.out.print(res[i][j]);
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}