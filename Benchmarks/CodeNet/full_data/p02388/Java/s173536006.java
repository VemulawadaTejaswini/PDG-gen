class XCubic {
	public static void main (String[] arg) {
		int a;
   		a = Integer.parseInt(arg[0]);
		if (a < 1 || a > 100) {
			System.out.println("Wrong input");
		} else {
			System.out.println(a * a * a);
		}
	}
}
