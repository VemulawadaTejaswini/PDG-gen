import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new A1136().ans(sc);

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
			}

			LinkedList<At> ahead;
			LinkedList<At> atail = new LinkedList<A1136.At>();

			ahead = ats.get(0);
			for (int i = 0; i < ahead.size() - 1; i++) {
				atail.addFirst(new At(ahead.get(i).x, -(ahead.get(i + 1).y)));
			}
			atail.addFirst(new At(ahead.getLast().x, 0));
			// System.out.println(ats);
			// System.out.println(ahead);
			// System.out.println(atail);

			for (int i = 1; i < ats.size(); i++) {
				boolean b = true;

				LinkedList<At> atmp = ats.get(i);
				if (atmp.size() == ahead.size()) {
					for (int j = 0; j < atmp.size(); j++) {
						if (atmp.get(j).equals(ahead.get(j))) {

						} else {
							b = false;
							break;
						}
					}
				}

				if (b) {
				} else {
					b = true;

					if (atmp.size() == atail.size()) {
						for (int j = 0; j < atmp.size(); j++) {
							if (atmp.get(j).equals(atail.get(j))) {

							} else {
								b = false;
								break;
							}
						}
					}
				}
				if (b) {
					System.out.println(i);
				}
			}

			System.out.println("+++++");
		}

	}

	public class At {
		public int x;
		public int y;

		public At(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return String.format("x%3d:y%3d", x, y);
		}

		@Override
		public boolean equals(Object obj) {
			At tmp = (At) obj;

			if (this.x == tmp.x && this.y == tmp.y) {
				return true;
			} else {
				return false;
			}
		}
	}

}