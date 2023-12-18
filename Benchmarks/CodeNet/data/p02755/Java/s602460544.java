import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = -1;
		
		for (int i = 1; i <= 1000; i++) {
			int _8Percent = (int) (i * 0.08);
			int _10Percent = (int) (i * 0.1);
			
			if (_8Percent == a && _10Percent == b) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
