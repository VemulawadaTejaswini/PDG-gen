import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		boolean ans = false;
		for(int a=0;a<=n;a++) {
			for(int b=0;b<=m;b++) {
				if ((n - a) * b + (m - b) * a == k) {
					ans = true;
				}
			}
		}
		System.out.println(ans ? "Yes" : "No");
	}
}