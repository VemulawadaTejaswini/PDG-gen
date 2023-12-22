import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i*j < n) {
					ans++;
				}
				else {
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}
