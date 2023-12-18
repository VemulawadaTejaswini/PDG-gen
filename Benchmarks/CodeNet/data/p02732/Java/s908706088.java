import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] buf = new int[N];
		int count;
		int ans = 0;
		int i;
		for(i = 0;i < N;i++){
			A[i] = sc.nextInt();
		}
		for(i = 0;i < N;i++){
			count = 1;
			System.arraycopy(A,0,buf,0,A.length);
			buf[i] = 0;
			Arrays.sort(buf);
			for(int k = 0;k < N;k++){
				if(k == N - 1){
					if(count != 1){
						ans += comb(count,2);
						count = 1;
					}
				}
				else if(count != 1 && buf[k] != buf[k+1]){
					ans += comb(count,2);
					count = 1;
				}else if(buf[k] == buf[k+1]){
					count++;
				}
			}
			System.out.println(ans);
			ans = 0;
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
	
}