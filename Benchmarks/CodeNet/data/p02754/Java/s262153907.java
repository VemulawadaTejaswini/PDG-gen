public class Main {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);
		int N = 6;
		int A = 2;
		int B = 4;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {

			// 青
			for (int j = 0; j < A; j++) {
				sb.append("b");
			}

			// 赤
			for (int k = 0; k < B; k++) {
				sb.append("r");
			}

		}
		//sb.toString().substring(0, N);
		//System.out.println(sb.toString().substring(0, N));
		int count = 0;
		String[] array = sb.toString().split("");

		for(int i = 0; i < sb.toString().substring(0, N).length(); i++ ) {
			//System.out.println(array[i]);
			// 青の時だけ
			 if(array[i].equals("b")) {
				 count++;
			 }

		}
		System.out.println(count);


	}

}