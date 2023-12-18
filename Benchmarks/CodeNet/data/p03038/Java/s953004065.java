import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	long[] a = new long[n];
	long[] sum = new long[n+1];

	for(int i = 0; i<n; i++) {
	    a[i] = Long.parseLong(sc.next());
	}
	Arrays.sort(a);

	//	System.out.println();
	for(int i = 0; i<n; i++) {
	    // System.out.print(a[i] + " ");
            sum[i+1] = a[i] + sum[i];
	}
	//System.out.println();

	long max = sum[n];
	for(int i = 0; i<m; i++) {
	    int b = Integer.parseInt(sc.next());
	    long c = Long.parseLong(sc.next());

	    if(c<=a[0]) continue;

	    //nibutan?
	    for(int j = b; j>0; j--) {
		if(a[j-1]>c) continue;
		//System.out.println("sumn: " + sum[n] + " sumb " + sum[j] + " cb " + (c*j) + " max? " + (sum[n]-sum[j]+c*j));
		max = Math.max(max, sum[n]-sum[j]+c*j);

		for(int k = 0; k<j; k++) a[k] = c;
		break;
	    }
	    Arrays.sort(a);
	    for(int j = 0; j<n; j++) {
		//System.out.print(a[j] + " ");
		sum[j+1] = a[j] + sum[j];
	    }
	    //System.out.println();
	    max = sum[n];
	}
	System.out.println(max);

    }
}