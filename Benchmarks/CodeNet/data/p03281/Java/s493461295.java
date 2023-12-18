import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = 105;
		
		if(n < 105) {
			System.out.println(0);
		} else {
			int ans = 0;
			int count = 0;
			for(int i=num; i<=n; i+=2) {
				for(int j=1; j<=i; j++) {
					if(i%j == 0) {
						count++;
					}
				}
				if(count == 8) {
					ans++;
				}
				count = 0;
			}
			System.out.println(ans);
		}
	}

}