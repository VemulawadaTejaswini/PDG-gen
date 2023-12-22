
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] nums1;
	int[] nums2;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			nums1 = new int[51];
			nums2 = new int[51];
			int n = sc.nextInt();
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					nums1[i+j]++;
					if( n-i-j>=0 )
						nums2[n-i-j]++;
					
				}
			}
			int cnt = 0;
			for(int i=0;i<51;i++) {
//				debug(nums1);
//				debug(nums2);
				cnt += nums1[i] * nums2[i];
			}
			System.out.println(cnt);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}