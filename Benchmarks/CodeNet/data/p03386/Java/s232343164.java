import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = Integer.parseInt(sc.next());
	int B = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());

	int pre = 1;
	int now = A;
	if(B-A+1 <= 2*K) {
	    for(int i = A; i<=B; i++) {
		System.out.println(i);
	    }
	    return;
	}
	for(int i=A; i<A+K; i++) {
	    System.out.println(i);
	}
	for(int i=K-1; i>=0; i--) {
	    System.out.println(B-i);
	}
    }
}