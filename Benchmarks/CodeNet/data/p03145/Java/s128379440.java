public class ARightTriangle {

	public static void main(String[] args) {
		int AB = Integer.valueOf(args[0]);
		int BC = Integer.valueOf(args[1]);
		int CA = Integer.valueOf(args[2]);
		int result = (AB * BC) / 2;
		System.out.println(result);
	}

}