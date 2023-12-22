class Main {

	public static void main(int week) {
		BigDecimal a = new BigDecimal(100000);
		BigDecimal b = new BigDecimal(0.05);
		for (int i = 0; i < week; i++) {
			a = a.multiply(b).setScale(-3, BigDecimal.ROUND_UP);

		}
		System.out.println(a);

	}

}