public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
	    int d = stdin.nextInt();
		int e = stdin.nextInt();
		int f = stdin.nextInt();
		
		int h = stdin.nextInt();
		int i = stdin.nextInt();
		int j = stdin.nextInt();
	    int k = stdin.nextInt();
		int l = stdin.nextInt();
		int m = stdin.nextInt();
		
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f);
		System.out.println(h + ", " + i + ", " + j + ", " + k + ", " + l + ", " + m);



		BigDecimal biX = new BigDecimal(String.valueOf((e * c - b * f)/(a * e - b * d)));
		BigDecimal biY = new BigDecimal(String.valueOf((d * c - a * f)/(b * d - a * e)));
		BigDecimal biZ = new BigDecimal(String.valueOf((l * j - i * m)/(h * l - i * k)));
		BigDecimal biW = new BigDecimal(String.valueOf((k * j - h * m)/(i * k - h * l)));

		double x = biX.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		double y = biY.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		double z = biZ.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		double w = biW.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(x + "," + y);
		System.out.println(z + "," + w);


	}
}