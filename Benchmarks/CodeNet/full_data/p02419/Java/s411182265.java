import java.io.*;


class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String x = br.readLine();
		int count = 0;
		for (; !((str = br.readLine()).equals("END_OF_TEXT"));) {
			String[] stg = str.split(" ");
			for (String i : stg) {
				if (i.equalsIgnoreCase(x))
					count++;
			}
		}
		System.out.println(count);
	}

}