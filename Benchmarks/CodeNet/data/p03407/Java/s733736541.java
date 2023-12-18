public class AtCorder091 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 0;
		int b = 0;
		int c = 0;

		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);

		if (((a >= 1) && (a <= 500)) && ((b >= 1) && (b <= 500)) && ((c >= 1) && (b <= 1000))) {
			if ( c <= a + b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
