import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n==0) break;
			int a[] = new int[n];
			for(int i=0; i<n; i++) a[i] = in.nextInt();
			System.out.println(solve(a));
		}
	}
	
	static int solve(int[] a){
		int n = a.length;
		int total = 0;
		int ret = 1<<29;
		for(int i=0; i<n; i++) total += a[i];
		for(int mask=0; mask<(1<<n); mask++){
			int sum = 0;
			for(int i=0; i<n; i++)if((mask & (1<<i)) > 0) sum += a[i];
			if(Math.abs(total - 2*sum) < ret)
				ret = Math.abs(total - 2*sum);
		}
		
		return ret;
	}
}