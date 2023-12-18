import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		int a = d / 10;
		int b = d % 10;
		int ans = 0;
		
		for(int i = 2; i <= a; i++) {
			if(i == a) {
				for(int j = 2; j <= b; j++) {
					if (i * j <= m) {
						ans++;
					}
				}
			}
			else {
				for(int j = 2; j < 10; j++) {
					if (i * j <= m) {
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}