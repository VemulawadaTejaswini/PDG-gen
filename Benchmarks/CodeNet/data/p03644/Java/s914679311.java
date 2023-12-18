import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int a = Integer.parseInt(in);

		int ans = 0;
		int max = 0;
		int wk = 0;
		for (int i = 1; i <= a; i++) {
			wk = div2(i);
			if (wk > max) {
				max = wk;
				ans = i;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private static int div2(int a) {
		int val = a;
		int mod = 0;
		int cnt = 0;
		while (true){
			mod = val % 2;
			val = val / 2;
			if (mod == 0 && val >= 2) {
				cnt++;
			} else if (mod == 0 && val < 2) {
				cnt++;
				break;
			} else {
				break;
			}
		}
		return cnt;
	}


}