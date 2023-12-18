import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0 ; i < n ; i++) d[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] t = new int[m];
		for(int i = 0 ; i < m ; i++) {
			t[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				if(d[i] == t[j]) {
					t[j] = -1;
					break;
				}
			}
		}
		for(int i = 0 ; i < m ; i++) {
			if(t[i] != -1) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
