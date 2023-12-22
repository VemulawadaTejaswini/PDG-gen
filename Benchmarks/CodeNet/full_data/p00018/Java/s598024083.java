import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		Integer[] vals = new Integer[5];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = sc.nextInt();
		}
		Arrays.sort(vals, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		ln(join(vals," "));
	}

	public static String join(Object[] array, String separator) {
		StringBuilder str = new StringBuilder(array[0] + "");
		for (int i = 1; i < array.length; i++) {
			str.append(separator).append(array[i] + "");
		}
		return str.toString();
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