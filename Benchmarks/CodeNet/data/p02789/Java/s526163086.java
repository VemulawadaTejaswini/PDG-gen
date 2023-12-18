	public static void main(String args[]) throws IOException {
		// 2020/1/30 No.152
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

	br.close();

		if (n == m )
			System.out.println("Yes");
		else
			System.out.println("No");
	}