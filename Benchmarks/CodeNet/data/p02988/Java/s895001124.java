public class Main {

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(readLine());
		int[] p = new int[n];
		String[] s = readLine().split(" ");
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(s[i]);
		}
		int count = 0;
		for (int i = 1; i < n - 1; i++) {
			if (p[i - 1] < p[i] && p[i] < p[i + 1]) {
				count++;
				continue;
			}
			if (p[i + 1] < p[i] && p[i] < p[i - 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static String readLine() throws IOException {
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
}