import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		int ans = 0;
		while (n > 3) {
			ans++;
			n = (int)Math.ceil((double)n/3);
		}
		out.println(ans+1);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}