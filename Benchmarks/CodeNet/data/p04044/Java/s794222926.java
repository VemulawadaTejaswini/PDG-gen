public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int l = s.nextInt();
		String array[] = new String[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = s.next();
		}
		s.close();
		System.out.println(Main.calc(n, l, array));
	}

	private static String calc(int n, int l, String[] array) {
		StringBuilder sb = new StringBuilder();
		java.util.Arrays.stream(array).sorted().forEach(sb::append);
		return sb.toString();
	}
}