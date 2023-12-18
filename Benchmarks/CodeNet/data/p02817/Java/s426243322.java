public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		String[] str = s.split(" ");
		System.out.printf("%s%s\n", str[0], str[1]);
		r.close();
	}
}