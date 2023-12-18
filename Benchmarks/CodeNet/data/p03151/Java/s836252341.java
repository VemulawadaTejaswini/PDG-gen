import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long[] a = new long[N];
	long[] b = new long[N];
	long[] offset = new long[N];
	long result = 0;
	long totalminus = 0;
	for(int i = 0; i<N; i++){
	    a[i] = sc.nextInt();
	}
	for(int i = 0; i<N; i++) {
	    b[i] = sc.nextInt();
	    if(a[i]<b[i]) {
		result++;
		totalminus += b[i]-a[i];
	    }
	}

	if(totalminus == 0) {
	    System.out.println(result);
	    return;
	}

	for(int i = 0; i<N; i++) {
	    offset[i] = a[i]-b[i];
	}
	Arrays.sort(offset);

	for(int i = N-1; i>=0; i--) {
	    totalminus = totalminus - offset[i];
	    result++;
	    if(totalminus <= 0) {
		System.out.println(result);
		return;
	    }

	}
	System.out.println(-1);
    }
}