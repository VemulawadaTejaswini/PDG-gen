class Main {
	public static void main(String[] args) {
		int x = 2;
		int cube = myPower(x);
		System.out.println(cube);
	}

	public static int myPower(int x) {
		int result = x;

		for (int n = 0; n < 2; n++) {
			result = result * x;
		}
		return result;
	}
}