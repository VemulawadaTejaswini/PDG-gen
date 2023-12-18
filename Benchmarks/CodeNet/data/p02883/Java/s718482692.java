import java.util.*;

public class Main {
    static int[] aArr;
    static int[] fArr;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long total = 0;
		aArr = new int[n];
		fArr = new int[n];
		for (int i = 0; i < n; i++) {
		    aArr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
		    fArr[i] = sc.nextInt();
		}
		Arrays.sort(aArr);
		Arrays.sort(fArr);
		long left = -1;
		long right = aArr[n - 1] * fArr[n - 1];
		while (right - left > 1) {
		    long m = (right + left) / 2;
		    if (check(k, m)) {
		        right = m;
		    } else {
		        left = m;
		    }
		}
		System.out.println(right);
	}
	
	static boolean check(long k, long x) {
	    for (int i = 0; i < aArr.length; i++) {
	        k -= aArr[i] - x / fArr[fArr.length - i - 1];
	        if (k < 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
