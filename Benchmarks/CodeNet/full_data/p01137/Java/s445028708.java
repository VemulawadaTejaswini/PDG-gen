import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int e;
		while (true) {
			e = sc.nextInt();
			if (e == 0) break;
			int min = 10000000;
			for (int z = 0; z*z*z <= e; z++) {
				for (int y = 0; y*y <= e-z*z*z; y++) {
					min = Math.min(min, e-z*z*z-y*y+y+z);
				}
			}
			out.println(min);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}