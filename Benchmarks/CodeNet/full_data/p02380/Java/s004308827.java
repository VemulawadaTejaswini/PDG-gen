public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int C = sc.nextInt();

			// S = 1/2 * a * (b * sinC)
			double rad = Math.PI*C/180.0;
			double h = b * Math.sin(rad);
			double S = 0.5 * a * h;
			double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(rad));

			System.out.println(S);
			System.out.println(a + b + c);
			System.out.println(h);
		}
	}

}
