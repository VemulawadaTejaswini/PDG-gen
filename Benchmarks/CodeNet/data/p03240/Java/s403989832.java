import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] x = new int[N];
	int[] y = new int[N];
	int[] h = new int[N];
	for(int i = 0; i<N; i++) {
	    x[i] = sc.nextInt();
	    y[i] = sc.nextInt();
	    h[i] = sc.nextInt();
	}
	if(N == 1) {
	    System.out.println(x[0] + " " + y[0] + " " + h[0]);
	    return;
	}
	for(int i = 0; i<=100; i++) {
	    for(int j = 0; j<=100; j++) {
		int cx = i;
		int cy = j;
		int ch = h[0] + (int)(Math.abs(cx-x[0])) + (int)(Math.abs(cy-y[0]));
		for(int k = 1; k<N; k++) {
		    if(Math.max((ch - (int)(Math.abs(cx-x[k])) - (int)(Math.abs(cy-y[k]))),0) != h[k]) {
			break;
		    }
		    if(k==N-1) {
			System.out.println(cx + " " + cy + " " + ch);
			return;
		    }
		}
	    }
	}
    }

}