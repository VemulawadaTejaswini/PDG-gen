import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int ans = 0;

		for(int i = 0; i < k; i++) {
			if(a >= 1) {
				a--;
				ans++;
			} else if(b >= 1) {
				b--;
			} else {
				c--;
				ans--;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}