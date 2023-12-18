
import java.util.Scanner;

public class Main {
    
    private static Scanner scan = new Scanner(System.in);
    private static final int N = Integer.parseInt(scan.next());
    private static final int A = Integer.parseInt(scan.next());
    private static final int B = Integer.parseInt(scan.next());
    private static int[] h;

    public static void main(String[] args) {

	h = new int[N];
	int hMax = 0;
	for (int i = 0; i < N; i++) {
	    h[i] = Integer.parseInt(scan.next());
	    hMax = (h[i] > hMax ? h[i] : hMax);
	}

	int maxCount = (hMax % B == 0 ? hMax/B : hMax/B+1);
	int ans = binarySearch(1, maxCount);

	System.out.println(ans);
	scan.close();
    }

    private static int binarySearch(int from, int to) {
	if(from == to) return from;

	int x = (from+to)/2;
	return enough(x) ? binarySearch(from, x) : binarySearch(x+1, to);
    }

    private static boolean enough(int T){
	long count = 0;
	for (int i = 0; i < N; i++) {
	    int rest = h[i] - T*B;
	    if(rest > 0) {
		count += (rest % (A-B) == 0 ? rest/(A-B) : rest/(A-B)+1);
	    }
	}
	return count <= T;
    }
}
