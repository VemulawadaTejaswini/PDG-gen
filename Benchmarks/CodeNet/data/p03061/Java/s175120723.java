import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        if(N==2) {
            System.out.println(Math.max(a[0],a[1]));
            return;
        }
	int[] left = new int[N+2];
	int[] right = new int[N+2];
        for(int i = 1; i<N; i++) {
	    left[i] = gcd(a[i-1],left[i-1]);
	    right[N+1-i] = gcd(a[N-i],right[N+2-i]);
        }
	int max = Integer.MIN_VALUE;
	for(int i = 1; i<N+1; i++) {
	    max = Math.max(max, gcd(left[i-1], right[i+1]));
	}
	System.out.println(max);
    }

    public static int gcd(int a, int b) {
	if(a<b) {
	    int tmp = a;
	    a = b;
	    b = tmp;
	}
        if(b==0)return a;
        return gcd(b, a%b);
    }
}