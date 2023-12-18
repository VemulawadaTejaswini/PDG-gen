public class Main {
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt(), s.nextInt(), s.nextInt(),
				s.nextInt(), s.nextInt(), s.nextInt()));
	}
	
	public Main(int a, int b, int c, int d, int e, int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public static String calc(int a, int b, int c, int d, int e, int f) {
		return new Main(a, b, c, d, e, f).calc();
	}

	public String calc() {
		double noudo = 0;
		int satousui = 0;
		int satou = 0;
		for (int i = 0; this.sum(i, 0, 0, 0) <= f; i++) {
			for (int j = 0; this.sum(i, j, 0, 0) <= f; j++) {
				for (int k = 0; this.sum(i, j, k, 0) <= f; k++) {
					for (int l = 0; this.sum(i, j, k, l) <= f; l++) {
						double cal = this.calcNoudo(i, j, k, l);
						if (this.isTokeru(i, j, k, l) && noudo < cal) {
							noudo = cal;
							satousui = this.sum(i, j, k, l);
							satou = c * k + d * l;
						}
					}
				}
			}
		}
		return satousui + " " + satou;
	}

	public int sum(int i, int j, int k, int l) {
		return 100 * i * a + 100 * j * b + k * c + l * d;
	}

	public double calcNoudo(int i, int j, int k, int l) {
		if ((100 * (i * a + j * b) + k * c + l * d) <= 0) {
			return 0;
		}
		return 100 * (k * c + l * d) / (100 * (i * a + j * b) + k * c + l * d);
	}

	public boolean isTokeru(int i, int j, int k, int l) {
		return (i * a + j * b) * e >= k * c + d * l;
	}

}