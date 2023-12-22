import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long ans = 1;
		int keta = 1;
		int ansKeta = 1;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextLong();
			keta = (int)Math.floor(Math.log10((double)A[i]));
			if(ansKeta + keta < 19 && ansKeta + keta > 0){
				ans *= A[i];
				ansKeta = (int)Math.floor(Math.log10((double)ans));
			}else{
				ans = -1;
			}
		}
		if(ans > 1000000000000000000L){
			ans = -1;
		}
		System.out.println(ans);
	}
}