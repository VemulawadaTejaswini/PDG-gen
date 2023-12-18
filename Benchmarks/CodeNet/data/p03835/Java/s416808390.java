import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long K = sc.nextInt();
		long S = sc.nextInt();
	//	int[]x = new int[S/3+1];
	//	int[]y = new int[K/3+1];
	//	int[]z = new int[K/3+1];
		long res = 0;
		for(long i = K; i>=0; i--){
			long v = S-i;
			if(v < K )res+=(v+1);
			else if(v == K) res+=(K+1);
			else if(v <= 2*K){
				long a = v-K;
				res+=K-a+1;
			}
		}
		System.out.println(res);
	}
}
