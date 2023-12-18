import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		boolean ad = false;
		if(n % 2 == 0) {
			ad = true;
		}
		String result = a+"";
		for(int i = 1; i < n; i++) {
			a = sc.nextLong();

			if(ad) {
				if(i % 2 == 1) {
					result = a + " " + result;
				} else {
					result = result + " " + a;
				}
			} else {
				if(i % 2 == 1) {
					result = result + " " + a;
				} else {
					result = a + " " + result;
				}
			}
		}

		System.out.println(result);

	}
}
