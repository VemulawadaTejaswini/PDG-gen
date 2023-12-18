import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int check = 0;
			int narray[] = new int [n];
			int marray[] = new int [m];
			String res = "War";
			for(int i = 0;i<n;i++) {
				narray[i] = sc.nextInt();
			}
			for(int i = 0;i<m;i++) {
				marray[i] = sc.nextInt();
			}
			for(int z = x+1;z<=y;z++) {
				for(int i = 0;i<n;i++) {
					if(narray[i]<z) {
						check++;
					}
				}
				for(int i = 0;i<m;i++) {
					if(marray[i]>=z) {
						check++;
					}
				}
				if(check==n+m) {
					res = "No War";
				}
				else {
					check = 0;
				}
		}
			sc.close();
			System.out.println(res);
		
		}
	public static void main(String[] args) {
		solve();
	}
}
