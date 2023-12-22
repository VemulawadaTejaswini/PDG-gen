public class Main {

	//@Test
	public static void main(String args[]) throws IOException {
		// System.out.println("Hello World");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String readLine = br.readLine();
		int ans = multiply(Integer.parseInt(readLine));
		System.out.println(ans);
	}

	public static int multiply(int inputNum) {
		int result = inputNum * 3;
		return result;
	}

}