public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int cnt = 0;
		if (A >= B) {
			System.out.println("1");
		} else {
			cnt++;
			cnt += Math.ceil((double)(B - A) /(double) (A - 1));
			System.out.println(cnt);
		}

	}
}