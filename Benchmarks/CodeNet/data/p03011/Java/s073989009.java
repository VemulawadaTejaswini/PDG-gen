public class Main {

	public static void main(String[] args) {

		if (args.length < 3) {

			return;
		}
		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);

		int minTime = p + q;
		if (minTime > q + r) {

			minTime = q + r;
		}
		if (minTime > r + p) {

			minTime = r + p;
		}
		System.out.println(minTime);
	}
}