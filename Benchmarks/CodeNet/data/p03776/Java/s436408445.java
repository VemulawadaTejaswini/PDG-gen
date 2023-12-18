
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static long[][] C = new long[51][51];

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());
	
	long[] v = new long[N];
	for (int i = 0; i < N; i++) {
	    v[i] = Long.parseLong(scan.next());
	}
	Arrays.sort(v);
	for (int i = 0; i < N/2; i++) {
	    long tmp = v[i];
	    v[i] = v[N-1-i];
	    v[N-1-i] = tmp;
	}

	int[] from = new int[N];
	int[] to = new int[N];
	to[N-1] = N-1;
	for (int i = 1; i < N; i++) {
	    from[i] = (v[i] == v[i-1] ? from[i-1] : i);
	    to[N-1-i] = (v[N-1-i] == v[N-i] ? to[N-i] : N-1-i);
	}
	
	long[] sum = new long[N];
	sum[0] = v[0];
	for (int i = 1; i < N; i++) {
	    sum[i] = sum[i-1] + v[i];
	}

	List<Integer> list = new ArrayList<Integer>();
	double max = 0;
	for (int i = A; i <= B; i++) {
	    double avg = sum[i-1]/(double)i;
	    if(avg > max) {
		max = avg;
		list.clear();
		list.add(i);
	    }
	    else if(max == avg) list.add(i);
	}

	long count = 0;
	for(int i: list) {
	    int select = i - from[i-1];
	    int total = to[i-1] - from[i-1] + 1;
	    count += combination(total, select);;
	}

	System.out.println(String.format("%.6f", max));
	System.out.println(count);
	scan.close();
    }

    private static long combination(int n, int r) {
	if(C[n][r] > 0) return C[n][r];
	
	if(n-r < r) return C[n][r] = combination(n, n-r);
	if(r-1 >= 0) return C[n][r] = n * combination(n-1, r-1) / r;

	return C[n][r] = 1;
    }
}
