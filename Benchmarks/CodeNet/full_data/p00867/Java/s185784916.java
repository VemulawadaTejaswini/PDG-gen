import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int check(int x[] , int y[]){
		for(int i = 2; i >= 0; i--){
			x[i] -= x[0];
			y[i] -= y[0];
		}
		int xx = x[1]*x[2] + y[1]*y[2];
		int yy = x[1]*y[2] - y[1]*x[2];
		
		if( yy > 0){
			return 5;
		}
return 2;
	}
	
	class ls {
		int x1;
		int y1;
		int x2;
		int y2;

		boolean s[] = new boolean[2];

		ls(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		int hit2(ls t) {
			if ((this.y2 - this.y1) * (t.x2 - this.x1) == (this.x2 - this.x1)
					* (t.y2 - this.y1)) {
				if ((this.y2 - t.y2) * (this.y1 - t.y2) <= 0) {
					return 2;
				}
			}
			return 0;

		}

		int hit1(ls t) {

			if ((this.y2 - this.y1) * (t.x1 - this.x1) == (this.x2 - this.x1)
					* (t.y1 - this.y1)) {
				if ((this.y2 - t.y1) * (this.y1 - t.y1) <= 0) {
					return 1;
				}
			}

			return 0;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			ls[] d = new ls[n];

			int dm[] = new int[n];
			for (int i = 0; i < n; i++) {
				d[i] = new ls(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc
						.nextInt());
				dm[i] = i;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						continue;
					}
					int key = d[i].hit1(d[j]);
					if (key != 0) {
						dm[i] = Math.min(dm[i], dm[j]);
						dm[j] = Math.min(dm[i], dm[j]);
						d[j].s[key - 1] = true;
					}
					key = d[i].hit2(d[j]);
					if (key != 0) {
						dm[i] = Math.min(dm[i], dm[j]);
						dm[j] = Math.min(dm[i], dm[j]);
						d[j].s[key - 1] = true;
					}
				}
			}

			// System.out.println(84+ " " + d[5].hit1(d[6]));
			for (int k = 0; k < 5; k++) {
				for (int i = 0; i < n; i++) {
					dm[i] = dm[dm[i]];
				}
			}
			// System.out.println(Arrays.toString(dm));

			int sp[] = new int[n];
			int sf[] = new int[n];
			for (int i = 0; i < n; i++) {
				sp[dm[i]]++;
				if (!(d[i].s[0])) {
					sf[dm[i]]++;
				}
				if (!(d[i].s[1])) {
					sf[dm[i]]++;
				}
			}
			// System.out.println("---");
			// System.out.println(Arrays.toString(sp));
			// System.out.println(Arrays.toString(sf));

			int ans[] = new int[10];

			boolean used[] = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (sp[dm[i]] != 0) {
					if (!used[dm[i]]) {
						used[dm[i]] = true;
						switch (sp[dm[i]]) {
						case 1:
							ans[1]++;
							break;
						case 3:
							switch (sf[dm[i]]) {
							case 2:
								ans[7]++;
								break;
							case 3:
								ans[4]++;
								break;
							default:
//								System.err.println(sf[dm[i]]);
	//							throw new OutOfMemoryError();
							}
							break;
						case 4:
							switch (sf[dm[i]]) {
							case 0:
								ans[0]++;
								break;
							case 1:
								ans[9]++;
								break;
							case 3:
								ans[3]++;
								break;
							default:
//								System.err.println(sf[dm[i]]);
//								throw new OutOfMemoryError();
							}
							break;
						case 5:
							switch (sf[dm[i]]) {
							case 0:
								ans[8]++;
								break;
							case 1:
								ans[6]++;
								break;
							case 2:
								for (int c = 0; c < n; c++) {
									if (dm[i] == dm[c]) {
										if (d[c].s[0] && d[c].s[1]) {
											continue;
										}
										int xx[] = new int[3];
										int yy[] = new int[3];

										int w = 0;
										for (int v = 0; v < n; v++) {
											if (c == v) {
												continue;
											}

											if (d[c].s[0]) {
												xx[0] = d[c].x2;
												yy[0] = d[c].y2;
												xx[1] = d[c].x1;
												yy[1] = d[c].y1;
												
												if (0 != d[v].hit1(d[c])) {
													w = v;
													break;
												}
											}
											if (d[c].s[1]) {
												xx[0] = d[c].x1;
												yy[0] = d[c].y1;
												xx[1] = d[c].x2;
												yy[1] = d[c].y2;
												
												if (0 != d[v].hit2(d[c])) {
													w = v;
													break;
												}
											}
										}
										
										xx[2] = d[w].x2;
										yy[2] = d[w].y2;
										if (d[c].hit1(d[w]) == 0) {
											xx[2] = d[w].x1;
											yy[2] = d[w].y1;
										}
										
										ans[check(xx,yy)]++;
										break;

									}
								}
								break;
							default:
//								throw new OutOfMemoryError();
							}
							break;
						case 2:
//							System.err.println(sp[dm[i]]);
							throw new OutOfMemoryError();
						}
					}

				}
			}

			for (int i = 0; i < 10; i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(ans[i]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}