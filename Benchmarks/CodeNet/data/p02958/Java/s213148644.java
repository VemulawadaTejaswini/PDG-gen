import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int ans =0;
			int array[]= new int[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
				if(array[i]!=i+1) {
					ans++;
				}
			}
			if(ans==2||ans==0) {
				System.out.print("Yes");
			}else
				System.out.print("No");
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
