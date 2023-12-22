public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int input = Integer.parseInt(str);

		while(input != 0) {
			int count = 0;
			int sum;

			for(int i = 1; i <= input/2; i++) {
				sum = 0;
				for(int j = i; sum < input; j++)
					sum = sum + j;

				if(sum == input)
					count++;

			}
			System.out.println(count);
			str = br.readLine();
			input = Integer.parseInt(str);
		}



	}

}

