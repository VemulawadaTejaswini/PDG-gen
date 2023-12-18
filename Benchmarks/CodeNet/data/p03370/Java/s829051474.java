import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int X = sc.nextInt();
	int min = Integer.MAX_VALUE;
	int flour = 0;
	int ans = 0;
	for(int i = 0; i < N; i++) {
	    int a = sc.nextInt();
	    flour += a;
	    min = Math.min(a, min);
	}
	ans += N;
	int left = X-flour;
	while(left>min) {
	    left-=min;
	    ans++;
	}
	System.out.println(ans);
    }
}