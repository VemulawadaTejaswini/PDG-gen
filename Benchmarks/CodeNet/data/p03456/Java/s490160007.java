public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int join = a * (int) Math.pow(10, (int) Math.log10(b) + 1) + b;
		System.out.println(IntStream.rangeClosed(1, 317).anyMatch(i -> join == i * i) ? "Yes" : "No");
	}
}
