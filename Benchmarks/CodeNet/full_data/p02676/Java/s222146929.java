import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();
			String []s = sc.next().split("");
			if(s.length>k) {
				for(int i = 0;i<k;i++) {
					System.out.print(s[i]);
					if(i == k-1) 
						System.out.print("...");
				}
			}
				else if(s.length<=k) {
					for(int i = 0;i<k-(k-s.length);i++)
					System.out.print(s[i]);
				}
			
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
