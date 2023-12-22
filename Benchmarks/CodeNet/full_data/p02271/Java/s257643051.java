import java.util.*;

class Main {

    static boolean[] SUM = new boolean[200 * 20 + 1];
    
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] A = new int[n];
	for(int i = 0; i < n; i++) {
	    A[i] = in.nextInt();
	}
	calc(0, A, 0, true);
	calc(0, A, 0, false);

	int q = in.nextInt();
	for(int i = 0; i < q; i++) {
	    System.out.println(SUM[in.nextInt()] ? "yes" : "no");
	}
    }

    public static void calc(int sum, int[] arr, int idx, boolean use) {
	if (idx == arr.length - 1) {
	    SUM[sum + (use ? arr[idx] : 0)] = true;
	} else {
	    if (use) { sum += arr[idx]; }
	    calc(sum, arr, idx + 1, true);
	    calc(sum, arr, idx + 1, false);
	}
    }
}

