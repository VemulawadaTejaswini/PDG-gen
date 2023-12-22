
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int sum = 0, ave = 0, c=0;
		for(;sc.hasNext();c++) {
			String[] vals = sc.next().split(",");
			sum += Integer.parseInt(vals[0]) * Integer.parseInt(vals[1]);
			ave += Integer.parseInt(vals[1]) * 10;
		}
		ave /= c; ave += 5;
		ave /= 10;
		System.out.println(sum);
		System.out.println(ave);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}