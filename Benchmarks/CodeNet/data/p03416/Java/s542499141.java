import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int A =sc.nextInt();
		int B = sc.nextInt();
		int ans =0;
		for (int i =A; i<=B; i++) {
			int first = i/10000%10;
			int second = i/1000%10;
			int forth =i/10%10;
			int fifth = i%10;
			if (first==fifth&&second==forth) {
				ans++;
			}
		}
		System.out.println(ans);
//------------------------------------------------------------
	}
}