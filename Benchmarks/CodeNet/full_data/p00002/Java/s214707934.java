public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = br.readLine();
			String[] nums = str.split(" ", 0);

			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);

	        System.out.println(a+b);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}