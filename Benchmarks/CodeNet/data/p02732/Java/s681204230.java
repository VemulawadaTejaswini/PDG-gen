import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] count = new int[N];
		int ans = 0;
		int i;
		for(i = 0;i < N;i++){
			A[i] = sc.nextInt();
			count[A[i] - 1]++;
		}
		for(i = 0;i < N;i++){
			if(count[A[i] - 1] != 0){
				count[A[i] - 1]--;
				ans = Sum(count,N);
				System.out.println(ans);
				count[A[i] - 1]++;
				ans = 0;
			}else{
				System.out.println(ans);
			}
		}
	}
	public static int comb(int n,int m){
		if(n < m || n == 0){
			return 0;
		}
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
		for(int i = 0;i < n;i++){
			ans += comb(a[i],2);
		}
		return ans;
	}
	
}