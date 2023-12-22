import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().io();
	}
	
	void solve(long s){
		for(int i=0; i<10; ++i){
			s = (s*s)%100000000;
			int dig = (int)Math.log10(s) + 1;
			
			String str = Long.toString(s);
			for(int j=dig; j<8; ++j){
				str = "0" + str;
			}
			
			String str_ = new String();
			for(int j=2; j < 6; ++j){
				str_ = str_ + str.charAt(j);
			}
			
			s = Long.parseLong(str_);
			System.out.println(s);
		}
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1; i<=n; ++i){
			System.out.println("Case " + i + ":");
			int s = sc.nextInt();
			solve(s);
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}