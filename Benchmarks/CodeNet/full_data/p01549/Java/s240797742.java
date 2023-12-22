import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		HashMap<String, Var> map = new HashMap<String, Var>();
		int M = sc.nextInt();
		for (int i = 0; i < M; ++i) {
			String name = sc.next();
			int lb = sc.nextInt();
			int ub = sc.nextInt();
			map.put(name, new Var(lb, ub));
		}
		int N = sc.nextInt();
		boolean result = true;
		ArrayList<Var> stack = new ArrayList<Var>();
		for (int i = 0; i < N; ++i) {
			String elem = sc.next();
			if (elem.equals("+")) {
				Var v1 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				Var v2 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				Var nv = new Var();
				for (int j = 0; j <= 255; ++j) {
					if (!v1.v[j]) continue;
					for (int k = 0; k <= 255; ++k) {
						if (!v2.v[k]) continue;
						nv.v[(k + j) % 256] = true;
					}
				}
				stack.add(nv);
			} else if (elem.equals("-")) {
				Var v1 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				Var v2 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				Var nv = new Var();
				for (int j = 0; j <= 255; ++j) {
					if (!v1.v[j]) continue;
					for (int k = 0; k <= 255; ++k) {
						if (!v2.v[k]) continue;
						nv.v[(k - j + 256) % 256] = true;
					}
				}
				stack.add(nv);
			} else if (elem.equals("*")) {
				Var v1 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				Var v2 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				Var nv = new Var();
				for (int j = 0; j <= 255; ++j) {
					if (!v1.v[j]) continue;
					for (int k = 0; k <= 255; ++k) {
						if (!v2.v[k]) continue;
						nv.v[(k * j) % 256] = true;
					}
				}
				stack.add(nv);
			} else if (elem.equals("/")) {
				Var v1 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				Var v2 = stack.get(stack.size() - 1);
				stack.remove(stack.size() - 1);
				if (v1.v[0]) {
					result = false;
					break;
				}
				Var nv = new Var();
				for (int j = 0; j <= 255; ++j) {
					if (!v1.v[j]) continue;
					for (int k = 0; k <= 255; ++k) {
						if (!v2.v[k]) continue;
						nv.v[k / j] = true;
					}
				}
				stack.add(nv);
			} else if (map.containsKey(elem)) {
				stack.add(map.get(elem));
			} else {
				stack.add(new Var(Integer.parseInt(elem)));
			}
		}
		System.out.println(result ? "correct" : "error");
	}

	static class Var {
		boolean[] v = new boolean[256];

		Var(int min, int max) {
			for (int i = min; i <= max; ++i) {
				v[i] = true;
			}
		}

		Var(int num) {
			v[num] = true;
		}

		Var() {}
	}

}