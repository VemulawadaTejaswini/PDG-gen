import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int res = 0;
			for (int i1 = 0; i1 < 10; i1++)
				for (int i2 = 0; i2 < 10; i2++)
					for (int i3 = 0; i3 < 10; i3++)
						for (int i4 = 0; i4 < 10; i4++)
							if (i1+i2+i3+i4 == n)
								res++;
			out.println(res);
				
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}