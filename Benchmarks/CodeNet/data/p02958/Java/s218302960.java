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
			for(int i = 0;i<n-1;i++) {
				if(array[i+1]-array[i]!=1) {
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
