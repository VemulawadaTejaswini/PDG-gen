
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong();
		long ans = 0;
		ans = (x/11)*2;
		long b = x%11;
		if(b != 0) {
			if(b<=6) {
				ans += 1;
			}else {
				ans += 2;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
