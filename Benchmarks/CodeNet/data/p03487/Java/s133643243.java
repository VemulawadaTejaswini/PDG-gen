import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long[] a = new long[n+1];
	for(int i = 1; i<n+1; i++) {
	    int tmp = sc.nextInt();
	    if(tmp > n) {
		continue;
	    }
	    a[tmp]++;
	}
	int cnt = 0;
	for(int i = 1; i<n+1; i++) {
	    if(a[i] > i) cnt+= a[i]-i;
	    else if(a[i] < i) cnt += a[i];
	}
	System.out.println(cnt);

    }
}