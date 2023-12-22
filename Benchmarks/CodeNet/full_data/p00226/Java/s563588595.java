import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			String r = sc.next(), a = sc.next();
			if (r.equals("0") && a.equals("0")) break;
			int h, b;
			h = b = 0;
			for (int i = 0; i < 4; i++) {
				if (r.charAt(i) == a.charAt(i))
					h++;
				else {
					for (int j = 0; j < 4; j++)
						if (r.charAt(i) == a.charAt(j))
							b++;
				}
			}
			out.printf("%d %d\n", h, b);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}