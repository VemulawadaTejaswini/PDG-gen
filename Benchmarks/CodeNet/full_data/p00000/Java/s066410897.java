class Main {
	public static void main(String[] a) {
		execute_ququ();
	}

	private static void execute_ququ() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "="+ kakezan(i,j));
			}
		}
	}

	private static int kakezan(int x, int y) {
		return x * y;
	}
}