import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = sc.nextInt();
	long[] a = new long[n];
	long cnt = 0;
	for(int i = 0; i<n; i++) {
	    a[i] = sc.nextInt();
	}

	if(a[0]>x) {
	    cnt = a[0]-x;
	    a[0] = x;
	}

	for(int i = 1; i<n; i++) {
            long tmp = Math.max(0,a[i]-(x-a[i-1]));
	    cnt += tmp;
	    a[i] = a[i]-tmp;
        }

	System.out.println(cnt);

    }
}