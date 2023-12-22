class main {

	public static void main() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int s = i * j;
				System.out.format("%dx%d=%d%n", i, j, s); 
			}
		}
	}
}