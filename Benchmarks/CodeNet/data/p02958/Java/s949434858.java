import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int ans =0;
			int array[]= new int[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			for(int i = 1;i<n;i++) {
				if(array[i]-array[i-1]!=1) {
					ans++;
				}
			}
			if(ans>=n-2) {
				System.out.print("No");
			}else
				System.out.print("Yes");
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
