public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double N = Integer.parseInt(scanner.nextLine());

		N = Integer.parseInt(args[0]);
		double v = ((int) (N / 2)) / N;
		
		System.out.println("" + v);
		
	}

}