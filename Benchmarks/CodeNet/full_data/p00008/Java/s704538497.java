import java.util.*;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}
	
	static boolean read() {
		if(!sc.hasNext()) return false;
		n = sc.nextInt();
		return true;
	}
	
	static void solve() {
		int cnt = 0;
		int ans = 0;
		if(n > 36)	{
			System.out.println(0);
			return;
		}
		for(int i=0; i <= 9; i++) {
			for(int j=0; j <= 9; j++) {
				for(int k=0; k <= 9; k++) {
					for(int l=0; l <= 9; l++) {
						ans = i+j+k+l;
						if(n == ans) cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}