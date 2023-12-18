public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
		 final String str = reader.readLine();

			final String sp[] = str.split(" ");
			int A = Integer.parseInt(sp[0]);
			int B = Integer.parseInt(sp[1]);
			String result;
			if (8 < A || 8 < B) {
				result = ":(";
			} else {
				result = "Yay!";
			}
			System.out.println(result);
		}
	}