public class Battle {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		while (a>0 && c>0) {
			c -= b;
			if (c <= 0) {
				System.out.println("Yes");
				break;
			}
			a -= d;
			if (a <= 0) {
				System.out.println("No");
				break;
			}
		}
	}
}