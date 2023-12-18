import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long ans = 0;
	long pre = 2;
	long pre2 = 1;
	for(int i = 2; i<=N; i++) {
	    ans = pre + pre2;
	    pre2 = pre;
	    pre = ans;
	}
	System.out.println(ans);
    }
}