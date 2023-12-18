public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int length = S.length();

		while(true) {
			if ((S.length() -1) % 2 == 0) {
				String sub1 = S.substring(0, S.length() / 2);
//				System.out.println("sub1:" + sub1);
				String sub2 = S.substring(S.length() / 2, S.length() -1);
//				System.out.println("sub2:" + sub2);
				if (sub1.equals(sub2)) {
					System.out.println(S.length()-1);
					return;
				} else {
					S = S.substring(0, (S.length()-1));
				}
			} else {
				S = S.substring(0, (S.length()-1));
			}
//			System.out.println(S);
		}
	}
}