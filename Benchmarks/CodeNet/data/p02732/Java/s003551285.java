import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] buf = new int[N];
		int[] count = new int[N];
		int ans = 0;
		int i;
		for(i = 0;i < N;i++){
			A[i] = sc.nextInt();
		}
		for(i = 0;i < N;i++){
			System.arraycopy(A,0,buf,0,A.length);
			buf[i] = 0;
			Arrays.sort(buf);
			for(int k = 0;k < N;k++){
				count[buf[i]]++;
			}
			ans = Sum(count,N);
			System.out.println(ans);
			ans = 0;
			Arrays.fill(count,0);
		}
	}
	public static int comb(int n,int m){
		int N = n;
		int M = m;
		int M2 = m;
		return Factorial(n) / (Factorial(M) * Factorial(n - M2));
	}
	public static int Factorial(int i){
		int ans = 1;
		while(i > 0){
			ans *= i;
			i--;
		}
		return ans;
	}
	public static int Sum(int[] a,int n){
		int ans = 0;
		for(int i = 1;i < n;i++){
			ans += a[i];
		}
		return ans;
	}
	
}