import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long[] total = new long[N];
	long bsum = 0;
	for(int i = 0; i<N; i++) {
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    bsum += b;
	    total[i] =  a+b;
	}
	Arrays.sort(total);
	long ans = 0;
	for(int i = 0; i<N; i++) {
	    if(i%2 == 0) {
		ans += total[i];
	    }
	}
	ans = ans - bsum;
	System.out.println(ans);

    }
}