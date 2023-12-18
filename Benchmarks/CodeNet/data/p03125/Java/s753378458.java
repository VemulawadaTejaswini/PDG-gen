ublic class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();
			if (0 == number2 % number1) {
				System.out.println(number1 + number2);
			} else {
				System.out.println(number2 - number1);
			}
		}
	}
}