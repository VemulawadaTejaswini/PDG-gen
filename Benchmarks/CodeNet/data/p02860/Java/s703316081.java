import java.util.Scanner;
public class Main {
		
		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int res = 0;
			String s = sc.next();
			for(int i = 0; i<n/2;i++) {
				if(s.charAt(i)!=s.charAt(n/2+i)) {
					res = 0;
				}else
					res++;
		}
			if(res == n/2&&n!=1) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
			
			sc.close();
		}
	
	public static void main(String[] args) {
		solve();

	}

}
