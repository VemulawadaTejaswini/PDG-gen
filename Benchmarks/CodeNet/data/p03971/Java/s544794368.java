import java.util.*;
public class Main {
	static Scanner s = new Scanner(System.in);

	static int n,a,b;
	static String v;
	public static void main(String __[]){
		input();
		solve();
	}
	private static void input() {
		n=s.nextInt();
		a=s.nextInt();
		b=s.nextInt();
		v=s.next();
	}
	private static void solve(){
		int count=0,foreigner=0;
		for(int i=0;i<n;i++) {
			switch (v.charAt(i)) {
			case 'a':
				if(count<a+b) {
					count++;
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				break;
			case 'b':
				if(count<a+b&&++foreigner<=b) {
					count++;
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				break;
			case 'c':
				System.out.println("No");
				break;
			}
		}
	}
}
