import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] a = new int[n];
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			total += a[i];
		}
		
		int ans = 0;
		int lim = total * (4*m);
		
		for(int j = 0; j < n; j++) {
			if(a[j] * (4*m) >= lim) {
				ans++;
			}
		}
		
		if(ans >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
