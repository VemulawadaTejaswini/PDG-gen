import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int W = sc.nextInt();
	int[] w = new int[N+1];
	int[] v = new int[N+1];
	for(int i = 1; i<N+1; i++) {
	    w[i] = sc.nextInt();
	    v[i] = sc.nextInt();
	}
	int V = 1000*N;

	long[][] weight = new long[N+1][V+1];

	weight[0][0] = 0;
	for(int i = 0; i<N+1; i++) {
	    for(int j = 1; j<V+1; j++) {
		if(i == 0) {
		    weight[i][j] = 1000000001;
		    continue;
		}
		if(j<v[i]) {
		    weight[i][j] = weight[i-1][j];
		}else{
		    weight[i][j] = Math.min(weight[i-1][j], weight[i-1][j-v[i]] + w[i]);
		}
	    }
	}
	int result = 0;
	for(int j = 0; j<V+1; j++) {
	    if(weight[N][j]<=W) {
		if(result<j) result = j;
	    }
	}
	System.out.println(result);
    }
}