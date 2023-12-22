import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public int solve(int l, int r, int op) {
		switch (op) {
		case 0:
			return l + r;
		case 1:
			return l - r;
		case 2:
			return l * r;
		default:
			return 0;
		}
	}

	public char op(int op) {
		switch (op) {
		case 0:
			return '+';
		case 1:
			return '-';
		case 2:
			return '*';
		default:
			return 0;
		}
	}

	public void run() {
		while (true) {
			int vals[] = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt(),
					sc.nextInt() };
			if (Arrays.equals(vals, new int[] { 0, 0, 0, 0 })) {
				break;
			}

			PermutationList pl = new PermutationList(4);

			boolean isset=false;
			end: for (int[] per : pl) {
				for (int op0 = 0; op0 < 3; op0++)
					for (int op1 = 0; op1 < 3; op1++)
						for (int op2 = 0; op2 < 3; op2++) {
							if (solve(
									solve(solve(vals[per[0]], vals[per[1]], op0),
											vals[per[2]], op1), vals[per[3]],
									op2) == 10) {
								ln("(((" + vals[per[0]] + " " + op(op0) + " "
										+ vals[per[1]] + ")" + " " + op(op1)
										+ " " + vals[per[2]] + ")" + " "
										+ op(op2) + " " + vals[per[3]] + ")");
								isset=true;
								break end;
							}
							if (solve(
									solve(vals[per[0]],solve(vals[per[1]],vals[per[2]], op1), op0),
											vals[per[3]],
									op2) == 10) {
								ln("((" + vals[per[0]] + " " + op(op0) + " "
										+"("+ vals[per[1]] + " " + op(op1)
										+ " " + vals[per[2]] + "))" + " "
										+ op(op2) + " " + vals[per[3]] + ")");
								isset=true;
								break end;
							}
							if (solve(vals[per[0]]
									,solve(solve(vals[per[1]],vals[per[2]],op1),vals[per[3]],op2),op0)==10
									) {
								ln("(" + vals[per[0]] + " " + op(op0) + " "
										+"(("+ vals[per[1]] + " " + op(op1)
										+ " " + vals[per[2]] + ")" + " "
										+ op(op2) + " " + vals[per[3]] + "))");
								isset=true;
								break end;
							}
							if (solve(vals[per[0]]
									,solve(vals[per[1]],solve(vals[per[2]],vals[per[3]],op2),op1),op0)==10
									)  {
								ln("(" + vals[per[0]] + " " + op(op0) + " "
										+"(" + vals[per[1]] + " " + op(op1)
										+ " "+"(" + vals[per[2]] + " "
										+ op(op2) + " " + vals[per[3]] + ")))");
								isset=true;
								break end;
							}
							if (solve(solve(vals[per[0]],vals[per[1]],op0),solve(vals[per[2]],vals[per[3]],op2),op1)==10
									)  {
								ln("((" + vals[per[0]] + " " + op(op0) + " "
										+ vals[per[1]] +")"+ " " + op(op1)
										+ " "+"(" + vals[per[2]] + " "
										+ op(op2) + " " + vals[per[3]] + "))");
								isset=true;
								break end;
							}
				}
			}
			if(!isset){
				ln("0");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}

class PermutationList implements Iterable<int[]> {
	private final int size;

	public PermutationList(int size) {
		if (size <= 0)
			throw new IllegalArgumentException();
		this.size = size;
	}

	public Iterator<int[]> iterator() {
		return new Iter(size);
	}

	private class Iter implements Iterator<int[]> {
		private final int[] source;
		private boolean isFirst = true;

		private Iter(int size) {
			source = new int[size];
			for (int i = 0; i < size; ++i) {
				source[i] = i;
			}
		}

		public boolean hasNext() {
			if (isFirst) {
				isFirst = false;
				return true;
			}

			int n = source.length;
			for (int i = n - 1; i > 0; i--) {
				if (source[i - 1] < source[i]) {
					int j = n;
					while (source[i - 1] >= source[--j])
						;
					swap(source, i - 1, j);
					reverse(source, i, n);
					return true;
				}
			}
			reverse(source, 0, n);
			return false;
		}

		public int[] next() {
			return source;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		private void swap(int[] is, int i, int j) {
			int t = is[i];
			is[i] = is[j];
			is[j] = t;
		}

		private void reverse(int[] is, int s, int t) {
			while (s < --t)
				swap(is, s++, t);
		}
	}
}