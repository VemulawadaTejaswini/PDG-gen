import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] l = new int[N-1];
	int[] x = new int[N];
	if(K == 1) {
	    System.out.println(sc.nextInt());
	    return;
	}
	for(int i = 0; i<N; i++) {
	    x[i] = sc.nextInt();
	    if(i > 0) {
		l[i-1] = x[i] - x[i-1];
	    }
	}
	int min = Integer.MAX_VALUE;
	for(int i = 0; i+K-2 < N-1; i++) {
	    int kl = 0;
	    for(int j = 0; j< K-1; j++){
		kl = kl + l[i+j];
	    }
	    int n = Math.min(Math.abs(x[i])+kl, Math.abs(x[i+K-1])+kl);
	    if(n<min) min = n;
	}
	System.out.println(min);

    }
}