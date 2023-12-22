import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int mod = n%10;
			if(mod==3) {
				System.out.println("bon");
			}
			else if(mod==2||mod==4||mod==5||mod==7||mod==9) {
				System.out.println("hon");
			}
			else {
				System.out.println("pon");
			}
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
