import java.util.Scanner;

public class Main {

	static int N;
	static long A[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    N =sc.nextInt();
	    A=new long[N];
	    for(int i = 0;i<N;i++) {
	    	A[i]=sc.nextLong();
	    }

	    long low =0;
	    long up = A[0];
	    while(true) {
	    	long mid = (low+up)/2;
	    	int c = check(mid);
	    	if(c==-1) {
	    		up = mid;
	    	}
	    	else if(c==1) {
	    		low = mid+1;
	    	}
	    	else {
	    		break;
	    	}
	    }
	    System.out.println(low);
	}

	private static int check(long mid) {
		long prev = mid;
		for(int i=0;i<N-1;i++) {
			long next= A[i]-prev;
			if(next<0)return -1;
			prev = next;
		}
		if(prev+mid==A[N-1])return 0;
		if(prev+mid>A[N-1])return -1;
		return 1;
	}



}