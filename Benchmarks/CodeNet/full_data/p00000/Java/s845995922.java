public class Main {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				sb.append(i + "x" + j + "=" + (i * j) + "\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}

