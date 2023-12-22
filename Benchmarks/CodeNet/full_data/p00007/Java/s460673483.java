class Main {
	public void main(int week) {

		BigDecimal shakkin = new BigDecimal(100000);
		BigDecimal taxper = new BigDecimal(0.05);
		BigDecimal rishi;
		int a = 0;

		for (int i = 0; i <= week; i++) {
			// 5%の利子を計算する
			rishi = shakkin.multiply(taxper);
			// 5%の利子を元金に足す
			shakkin = shakkin.add(rishi);
			// 1000円未満を切り上げる
			a = shakkin.setScale(-3, BigDecimal.ROUND_UP).intValue();
		}
		System.out.println(a);
	}
}