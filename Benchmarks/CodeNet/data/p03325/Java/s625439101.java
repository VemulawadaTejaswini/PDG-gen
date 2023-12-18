import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] array = new int [n];
			int ans = 0;
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			sc.close();
			for(int j = 0;j<n+1;j++) {
			for(int i = 0;i<n;i++) {
				if(array[i]%2==0 && array[i] !=2) {
					array[i]/=2;
					ans++;
				}
				else {
					array[i]*=3; 
				}
			}
		}
			System.out.println(ans);
		}
	
	public static void main(String[] args) {
		solve();
	}

}