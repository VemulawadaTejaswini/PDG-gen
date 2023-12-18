import java.util.*;

public class Main {
	static class Dish {
		long a, b;
		boolean eaten = false;

		Dish(long a, long b) {
			this.a = a;
			this.b = b;
		}

		long getScoreA() {
			return a - b;
		}

		long getScoreB() {
			return b - a;
		}
	}

	Comparator<Dish> compA = new Comparator<Dish>() {
		@Override
		public int compare(Dish o1, Dish o2) {
			if (o1.a > o2.a) {
				return -1;
			} else if (o1.a < o2.a) {
				return 1;
			} else {
				if (o1.b > o2.b) {
					return -1;
				} else if (o1.b < o2.b) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	};

	Comparator<Dish> compB = new Comparator<Dish>() {
		@Override
		public int compare(Dish o1, Dish o2) {
			if (o1.b > o2.b) {
				return -1;
			} else if (o1.b < o2.b) {
				return 1;
			} else {
				if (o1.a > o2.a) {
					return -1;
				} else if (o1.a < o2.a) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	};

	int N;
	long[] A, B;
	Queue<Dish> listA, listB;
	long happyA = 0, happyB = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		A = new long[N];
		B = new long[N];
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.nextLine().split(" ");
			A[i] = Long.parseLong(tokens[0]);
			B[i] = Long.parseLong(tokens[1]);
		}
		in.close();

		// listを作成
		listA = new PriorityQueue<>(compA);
		listB = new PriorityQueue<>(compB);
		for (int i = 0; i < N; ++i) {
			Dish dish = new Dish(A[i], B[i]);
			listA.add(dish);
			listB.add(dish);
		}
	}

	void calc() {
		boolean isATurn = true;
		while (true) {
			if (isATurn) {
				Dish a = getA();
				if (a == null) {
					break;
				}
				happyA += a.a;
				// System.out.println("dish: " + a.a + ", " + a.b);
				a.eaten = true;
				isATurn = false;
			} else {
				Dish b = getB();
				if (b == null) {
					break;
				}
				happyB += b.b;
				// System.out.println(" dish: " + b.a + ", " + b.b);
				b.eaten = true;
				isATurn = true;
			}
		}
	}

	Dish getA() {
		Dish result = null;
		while (true) {
			if (listA.isEmpty()) {
				result = null;
				break;
			}
			result = listA.poll();
			if (!result.eaten) {
				break;
			}
		}
		return result;
	}

	Dish getB() {
		Dish result = null;
		while (true) {
			if (listB.isEmpty()) {
				result = null;
				break;
			}
			result = listB.poll();
			if (!result.eaten) {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		long result = ins.happyA - ins.happyB;
		System.out.println(result);
	}

}