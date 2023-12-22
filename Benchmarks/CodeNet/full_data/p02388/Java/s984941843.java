class Main {
	public static void main(String[] args) throws java.io.IOException {
		int sum = 1;
		for (int i=0; i<3; i++) {
			int a = System.in.read();
			sum *= a;
		}
		System.out.println(sum);
	}
}