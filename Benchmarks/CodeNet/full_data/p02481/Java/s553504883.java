import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("%d %d\n", a * b, 2 * (a + b));

	}

}

class A1500 {
	int count1500 = 0;

	public void ans(Scanner sc) {
		int len = sc.nextInt();
		sc.nextLine();
		String id = sc.nextLine();
		int x = sc.nextInt();
		ArrayList<Integer> pa = new ArrayList<Integer>();
		ArrayList<Integer> po = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			pa.add(sc.nextInt());
			if (pa.get(i) % 2 == 0) {

			} else {
				po.add(pa.get(i));
			}
		}

		int sum = 0;
		int even = 0;
		int odd = 0;

		for (int i = 0; i < id.length(); i++) {
			int t = id.length() - i - 1;

			char c = id.charAt(t);
			if (c == '*') {
				if (t % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else {
				int d = Integer.parseInt(String.valueOf(c));
				if (t % 2 == 0) {
					sum += (d / 10) + (d % 10);
				} else {
					sum += d;
				}
			}
		}

		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);

		System.out.println(id);
	}

	void re1500(int sum, int even, int odd, ArrayList<Integer> pa,
			ArrayList<Integer> po) {
		if (even == 0 && odd == 0) {

		} else {
			if (sum % 2 == 0) {

			} else {
				if (odd > 0) {
					for (Iterator iterator = po.iterator(); iterator.hasNext();) {
						Integer integer = (Integer) iterator.next();
						re1500(sum + integer, even, odd - 1, pa, po);
					}
				}
			}
		}
	}

}

class A1129 {

	public void ans(Scanner sc) {

		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();

			if (n == 0) {
				break;
			}
			LinkedList<Integer> yama = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				yama.addFirst(i + 1);
			}
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();

				for (int j = 0; j < c; j++) {
					yama.add(j, yama.remove(p + j - 1));
				}
			}
			System.out.println(yama.getFirst());
		}

	}

}

class A1135 {

	public void ans(Scanner sc) {
		int M = sc.nextInt();

		for (int m = 0; m < M; m++) {
			int money = sc.nextInt();
			int year = sc.nextInt();

			int n = sc.nextInt();
			int max = 0;
			for (int i = 0; i < n; i++) {
				int me = sc.nextInt();
				double ri = sc.nextDouble();
				int te = sc.nextInt();

				int A = money;
				if (me == 1) {
					for (int y = 0; y < year; y++) {
						A = A + (int) (A * ri) - te;
					}
				} else {
					int Risi = 0;
					for (int y = 0; y < year; y++) {
						Risi += (int) (A * ri);
						A = A - te;
					}
					A += Risi;
				}
				max = Math.max(max, A);
			}

			System.out.println(max);
		}

	}

}

class A1159 {

	public void ans(Scanner sc) {
		while (true) {
			int N = sc.nextInt();
			int P = sc.nextInt();

			LinkedList<Integer> member = new LinkedList<Integer>();

			if (N == 0) {
				break;
			}
			for (int i = 0; i < N; i++) {
				member.add(0);
			}

			int i = 0;
			int p = P;
			while (true) {

				if (0 < p) {
					member.set(i, member.get(i) + 1);
					p--;
					if (member.get(i) == P) {
						break;
					}
				} else {
					p += member.get(i);
					member.set(i, 0);
				}
				i = (i + 1) % member.size();
			}

			System.out.println(i);
		}

	}

}

class A1165 {

	public void ans(Scanner sc) {
		while (true) {
			int N = sc.nextInt();

			LinkedList<Integer> xl = new LinkedList<Integer>();
			LinkedList<Integer> yl = new LinkedList<Integer>();

			if (N == 0) {
				break;
			}

			xl.add(0);
			yl.add(0);

			for (int i = 1; i < N; i++) {
				int n = sc.nextInt();
				int a = sc.nextInt();

				int dx = 0;
				int dy = 0;
				switch (a) {
				case 0:
					dx = -1;
					break;
				case 1:
					dy = -1;
					break;
				case 2:
					dx = 1;
					break;
				case 3:
					dy = 1;
					break;

				}
				xl.add(xl.get(n) + dx);
				yl.add(yl.get(n) + dy);
			}

			int xx = Collections.max(xl);
			int yx = Collections.max(yl);
			int xs = Collections.min(xl);
			int ys = Collections.min(yl);

			System.out.printf("%d %d\n", xx - xs + 1, yx - ys + 1);
		}

	}

}

class A1179 {

	public void ans(Scanner sc) {
		int N = sc.nextInt();
		int n = 0;
		while (n < N) {
			n++;

			int Y = sc.nextInt();
			int M = sc.nextInt();
			int D = sc.nextInt();

			int count = 0;
			for (int y = Y + 1; y < 1000; y++) {
				if (y % 3 == 0) {
					count += (20 * 10);
				} else {
					count += (20 * 5 + 19 * 5);
				}
			}
			for (int m = M + 1; m <= 10; m++) {
				if (Y % 3 == 0) {
					count += 20;
				} else {
					if (m % 2 == 0) {
						count += 19;
					} else {
						count += 20;
					}
				}
			}
			if (M % 2 == 0 && Y % 3 != 0) {
				count += (19 - D);

			} else {
				count += (20 - D);
			}

			System.out.printf("%d\n", count + 1);
		}

	}

}

class A1136 {

	public void ans(Scanner sc) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}

			LinkedList<LinkedList<At>> ats = new LinkedList<LinkedList<At>>();

			for (int n = 0; n < N + 1; n++) {
				ats.add(new LinkedList<A1136.At>());
				int M = sc.nextInt();

				int x = sc.nextInt();
				int y = sc.nextInt();
				int d = -1;
				for (int m = 1; m < M; m++) {
					int nx = sc.nextInt();
					int ny = sc.nextInt();

					switch (d) {
					case -1:
						if (nx < x) {
							ats.getLast().add(new At(x - nx, 0));
							d = 0;
						}
						if (x < nx) {
							ats.getLast().add(new At(nx - x, 0));
							d = 2;
						}
						if (ny < y) {
							ats.getLast().add(new At(y - ny, 0));
							d = 1;
						}
						if (y < ny) {
							ats.getLast().add(new At(ny - y, 0));
							d = 3;
						}
						break;
					case 0:
						if (ny < y) {
							ats.getLast().add(new At(y - ny, -1));
							d = 1;
						}
						if (y < ny) {
							ats.getLast().add(new At(ny - y, 1));
							d = 3;
						}
						break;
					case 2:
						if (ny < y) {
							ats.getLast().add(new At(y - ny, 1));
							d = 1;
						}
						if (y < ny) {
							ats.getLast().add(new At(ny - y, -1));
							d = 3;
						}
						break;
					case 1:
						if (nx < x) {
							ats.getLast().add(new At(x - nx, 1));
							d = 0;
						}
						if (x < nx) {
							ats.getLast().add(new At(nx - x, -1));
							d = 2;
						}
						break;
					case 3:
						if (nx < x) {
							ats.getLast().add(new At(x - nx, -1));
							d = 0;
						}
						if (x < nx) {
							ats.getLast().add(new At(nx - x, 1));
							d = 2;
						}
						break;
					}

					x = nx;
					y = ny;
				}
				// System.out.println(ats.getLast());
			}

			LinkedList<At> ahead;
			LinkedList<At> atail = new LinkedList<A1136.At>();

			ahead = ats.get(0);
			for (int i = 0; i < ahead.size() - 1; i++) {
				atail.addFirst(new At(ahead.get(i).x, -(ahead.get(i + 1).y)));
			}
			atail.addFirst(new At(ahead.getLast().x, 0));

			for (int i = 1; i < ats.size(); i++) {
				boolean b = true;

				LinkedList<At> atmp = ats.get(i);
				if (atmp.size() == ahead.size()) {
					for (int j = 0; j < atmp.size(); j++) {
						if (atmp.get(j).x == ahead.get(j).x
								&& atmp.get(j).y == ahead.get(j).y) {

						} else {
							b = false;
							break;
						}
					}
				}

				if (b) {
					System.out.println(i);
				} else {
					b = true;

					if (atmp.size() == atail.size()) {
						for (int j = 0; j < atmp.size(); j++) {
							if (atmp.get(j).x == atail.get(j).x
									&& atmp.get(j).y == atail.get(j).y) {

							} else {
								b = false;
								break;
							}
						}
					}

					if (b) {
						System.out.println(i);
					}

				}
			}

			System.out.printf("+++++\n");
		}

	}

	class At {
		public int x;
		public int y;

		public At(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "x:" + x + "==y:" + y;
		}

	}

}