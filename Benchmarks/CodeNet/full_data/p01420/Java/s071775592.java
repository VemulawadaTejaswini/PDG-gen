import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static long[][] com = new long[51][51];

	static class Person {
		public Person(double p, double t, double v) {
			P = p;
			T = t;
			V = v;
		}

		double P;
		double T;
		double V;

	}

	static class Match {
		int N;
		int M;
		int L;
		Person[] persons;
		double[] time;
		double[] pro;

		public Match() {
			N = scanner.nextInt();
			M = scanner.nextInt();
			L = scanner.nextInt();
			persons = new Person[N];
			time = new double[N];
			pro = new double[N];

			for (int i = 0; i < N; i++) {
				persons[i] = new Person(scanner.nextDouble() / 100,
						scanner.nextDouble(), scanner.nextDouble());
				if(persons[i].V == 0)
					time[i] = Integer.MAX_VALUE;
				else 
					time[i] = L / persons[i].V;
				pro[i] = 0;
			}
		}

		public void personWin(int n) {

			for (int i = 0; i <= M; i++) {
				double aPro = 1;
				double pn = 1;
				double nowtime = time[n] + i * persons[n].T;
				aPro *= com[M][i] * Math.pow(persons[n].P, i)
						* Math.pow(1 - persons[n].P, M - i);
				for (int j = 0; j < N; j++) {	
					double p = 0;
					if (j != n) {
						if (nowtime >= time[j]) {
							if (persons[j].T != 0) {
								double tmp = (nowtime - time[j]) / persons[j].T;
								int test = (int) (tmp) + 1;
								if (test > M)
									p = 0;
								else {
									for (int k = test; k <= M; k++) {
										p += com[M][k]
												* Math.pow(persons[j].P, k)
												* Math.pow(1 - persons[j].P, M
														- k);
									}
								}
							}
						} else {
							p = 1;
						}

						pn *= p;
					}

				}
				pro[n] += pn * aPro;
			}
		}

		public void personWin() {
			for (int i = 0; i < N; i++) {
				personWin(i);
				System.out.format("%.8f", pro[i]);
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		com[0][0] = 1;
		for (int i = 1; i < 51; i++)
			com[i][0] = 1;
		for (int i = 1; i < 51; i++)
			for (int j = 1; j <= i; j++)
				com[i][j] = com[i - 1][j - 1] + com[i - 1][j];

		// for(int i=0;i<51;i++)
		// for(int j=0;j<=i;j++){
		// System.out.println(i+" "+j+" "+com[i][j]);
		// }
		Match match = new Match();
		match.personWin();
	}
}