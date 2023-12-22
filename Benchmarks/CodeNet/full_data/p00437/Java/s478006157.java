import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static class Tag implements Comparable<Tag> {
		int a, b, c;
		boolean ok;

		public Tag(int a, int b, int c, boolean ok) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.ok = ok;
		}

		@Override
		public int compareTo(Tag arg0) {
			if (this.ok && !arg0.ok) {
				return -1;
			} else if (!this.ok && arg0.ok) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			final int N = sc.nextInt();

			Tag[] tags = new Tag[N];

			for (int i = 0; i < N; i++) {
				tags[i] = new Tag(sc.nextInt(), sc.nextInt(), sc.nextInt(),
						sc.nextInt() == 1);
			}

			Arrays.sort(tags);

			int[] variables = new int[a + b + c + 1];

			for (int i = 0; i < a + b + c + 1; i++) {
				variables[i] = 2;
			}

			//while (true) {
				//boolean updated = false;
				for (int i = 0; i < N; i++) {
					if (tags[i].ok) {
						variables[tags[i].a] = 1;
						variables[tags[i].b] = 1;
						variables[tags[i].c] = 1;
					} else {
						if (variables[tags[i].a] == 1
								&& variables[tags[i].b] == 1) {
							variables[tags[i].c] = 0;
							//updated = true;
						} else if (variables[tags[i].b] == 1
								&& variables[tags[i].c] == 1) {
							variables[tags[i].a] = 0;
							//updated = true;
						} else if (variables[tags[i].c] == 1
								&& variables[tags[i].a] == 1) {
							variables[tags[i].b] = 0;
							//updated = true;
						}
					}
				}

				//if (!updated) {
					//break;
				//}
			//}

			for (int i = 1; i < a + b + c + 1; i++) {
				System.out.println(variables[i]);
			}
		}

	}

}