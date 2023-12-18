import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int dif = b - a;
		int ans;
		if (dif % 2 == 0) {
			ans = dif / 2;
		} else {
			ans = a - 1 + (dif + 1) / 2;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
	
}

