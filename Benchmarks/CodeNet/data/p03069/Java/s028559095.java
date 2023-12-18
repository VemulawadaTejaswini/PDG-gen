public class Main {

	public static void main(String[] args) {
		int N = 0;
		String S;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		S = sc.next();
		int result = 0;
		int count = 0;
		for (;;) {
			result = S.indexOf("#.");
			if (result !=-1) {
				S = S.replaceFirst("#.", "##");
				count++;
			}else
				break;
		}
		System.out.println(count);
	}

}