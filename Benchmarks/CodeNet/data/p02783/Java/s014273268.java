public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int A = sc.nextInt();
		int cnt = 0;
		
		while (H >= 0) {
			if (H - A >= 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

		

	}
}