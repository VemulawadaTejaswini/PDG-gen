import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int A = io.nextInt();
		int B = io.nextInt();
		Long[] v = new Long[N];
		for (int i = 0; i < N; i++) {
			v[i] = io.nextLong();
		}
		Arrays.sort(v,Collections.reverseOrder());
		
		long sum = 0;
		long pair = 0;
		
		long now = -1;
		int seq = 0;
		for(int i=0;i<A;i++){
			sum += v[i];
			if(now != v[i]){
				now = v[i];
				seq = 1;
			}else{
				seq ++;
			}
		}
		int after = 0;
		for(int i=A;i<N;i++){
			if(now!=v[i]) break;
			else after ++;
		}
		
		if(now!=v[0]){
			pair = comp(seq+after,seq);
		}else{
			for(int i=A;i<=Math.min(B,seq+after);i++){
				pair += comp(seq+after,i);
			}
		}
		
		System.out.println(sum/((double)A));
		System.out.println(pair);
	}
	
	public static long[][] map = new long[51][51];
	
	public static long comp(int a,int b){
		
		if(map[a][b]!=0) return map[a][b];
		long ans = 0;
		if(b==0 || b==a){
			ans = 1;
		}else{
			ans = comp(a-1,b-1)+comp(a-1,b);
		}
		map[a][b] = ans;
		return ans;
	}
}	