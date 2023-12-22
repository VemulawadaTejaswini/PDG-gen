import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		int[] num = new int[10];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++)
				num[j] = sc.nextInt();
			
			int a, b;
			boolean flag, flag2 = false;
			for (int j = 0; j < 1 <<10; j++) {
				a = b = 0;
				flag = true;
				for (int k = 0; k < 10; k++) {
					if ((1 & j >> k) == 1) {
						if (a < num[k]) {
							a = num[k];
						} else {
							flag = false;
							break;
						}
					} else {
						if (b < num[k]) {
							b = num[k];
						} else {
							flag = false;
							break;
						}
					}
				}
				if (flag) {
					flag2 = true;
					break;
				}
			}
			if (flag2)
				out.println("YES");
			else
				out.println("NO");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}