public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int n = sc.nextInt();

			java.util.stream.IntStream.rangeClosed(1, n)
					.filter(num -> num % 3 == 0 || String.valueOf(num).contains("3"))
					.forEachOrdered(num -> System.out.print(" " + num));
			System.out.println("");
		}
	}
}
