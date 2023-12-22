public class Main {
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("At least one argument required.");
			return;
		}

		double value = Double.parseDouble(args[0]);
		
		double result = Math.pow(value, 3.0);

		System.out.println((int)result);
	}
}