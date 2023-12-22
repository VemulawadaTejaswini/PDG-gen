public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long y = 1;
		int loop = sc.nextInt();
		for (int i = 0; i < loop; i++) {
			y *= sc.nextInt();
		}
		if (y <= Math.pow(10, 18)) {
			System.out.println(y);
		}else{
			System.out.println("-1");
		}
	}

}