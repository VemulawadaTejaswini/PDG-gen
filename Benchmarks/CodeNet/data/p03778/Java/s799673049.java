public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		System.out.println(Math.max(Math.abs(a-b)-W, 0));
	}
}
