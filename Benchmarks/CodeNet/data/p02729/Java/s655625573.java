import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = comb(N,2) + comb(M,2);
		System.out.println(ans);
	}
	public static int comb(int n,int m){
		int buf = 1;
		int buf2 = 1;
		int buf3 = 1;
		int i;
		int N = n;
		int M = m;
		if(n < m){
			return 0;
		}
		for(i = 0;i < n-1;i++){
			buf *= N;
			N--;
		}
		for(i = 0;i < m-1;i++){
			buf2 *= M;
			buf3 *= n - M;
			M--;
		}
		return buf / (buf2 * buf3);
	}
}