import java.util.*;

class Main {

	static int MAX = 1000000;
	static boolean isPrime[] = new boolean[MAX+2];

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		seive();
		for(;;){
			int n = in.nextInt(), ub = in.nextInt();
			if(n==0 && ub==0) return ;
			int a[] = new int[n];
			for(int i=0; i<n; i++){
				a[i] = in.nextInt();
			}
			int ans = solve(a, ub);
			if(ans < 0) System.out.println("NA");
			else System.out.println(ans);
		}
	}
	
	static int solve(int[] a, int ub){
		boolean ok[] = new boolean[ub+1];
		ok[0] = true;
		for(int i=0; i<ub; i++)if(ok[i]){
			for(int j=0; j<a.length; j++)if(i+a[j] <= ub){
				ok[i + a[j]] = true;
			}
		}
		int ans = -1;
		for(int i=ub; i>0; i--)if(ok[i] && isPrime[i]){
			ans = i;
			break;
		}
		
		return ans;
	}
	
	static void seive(){
		for(int i=1; i<=MAX; i++) isPrime[i] = true;
		for(int i=2; i*i<=MAX; i++)if(isPrime[i]){
			for(int j=2*i; j<=MAX; j+=i)
				isPrime[j] = false;
		}
	}
}