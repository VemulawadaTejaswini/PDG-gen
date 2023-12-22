public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();
		if(w >= v) {
			System.out.print("NO");
			System.exit(0);
		}

		double dis = Math.abs(a - b);
		double num = v - w;
		num *= t;

		if(num >= dis) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
	}
}