import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, i, sum = 0, ans = 0;		
		n = sc.nextInt();
		int t[] = new int[n];
		for(i = 0; i < n; i++){
			t[i] = sc.nextInt();
			sum += t[i];
		}
		m = sc.nextInt();
		for(i = 0; i < m; i++){
			sum = (sum - t[sc.nextInt() - 1]) + sc.nextInt();
			System.out.println(ans);
		}
	}
}
