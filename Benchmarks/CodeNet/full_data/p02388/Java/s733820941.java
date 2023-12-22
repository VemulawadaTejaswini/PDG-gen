public class Main {

	public static void main(String[] args)throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		Integer n = Integer.parseInt(s);
		System.out.println(n*n*n);

	}

}

