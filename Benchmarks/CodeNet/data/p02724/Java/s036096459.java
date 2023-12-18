import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int x_5 = X%100;
		int ans = (int)(x_5/5)*5;
		ans += (int)X/500*1000;
		System.out.println(ans);
	}
}
