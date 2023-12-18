public class pair {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double k = in.nextInt();
		
		double pair = Math.ceil(k / 2) * Math.ceil((k - 1) / 2);
		System.out.println((int)pair);

	}

}