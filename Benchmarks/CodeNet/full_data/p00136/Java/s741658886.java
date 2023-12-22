
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] freq = new int[6];
		for(int i=0;i<n;i++) {
			double d = sc.nextDouble();
			if( d < 165.0 ) freq[0]++;
			else if( d < 170.0 ) freq[1]++;
			else if( d < 175.0 ) freq[2]++;
			else if( d < 180.0 ) freq[3]++;
			else if( d < 185.0 ) freq[4]++;
			else freq[5]++;
		}
		for(int i=0;i<6;i++) {
			System.out.print((i+1) + ":");
			for(int j=0;j<freq[i];j++) System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}