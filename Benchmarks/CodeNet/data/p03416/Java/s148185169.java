import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for(int i = a ; i <= b ; i++) {
			String s = String.valueOf(i);
			if(s.substring(0, 2).equals(s.substring(3))) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
