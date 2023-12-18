import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		long money = 100;
		int ans = 0;
		while(money<X) {
			money += money/100;
			ans++;
		}
		
		System.out.println(ans);

		sc.close();
	}
}
