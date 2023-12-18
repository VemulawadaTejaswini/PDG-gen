import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		double exp_arr[] = new double[N];
		double exp_sum[] = new double[N];
		// boolean flag = true;
		//格納
		//期待値算出
		//期待値合計
		for (int i = 0; i < N; i++) {
			exp_arr[i] = (double)(1+sc.nextInt())/2;
			if(i==0){
				exp_sum[i] = exp_arr[i];
			}else{
				exp_sum[i] = exp_arr[i] + exp_sum[i-1];
			}
		}

		double exp_max_arr[] = new double[N-K+1];
		double max = 0;
		for (int i = 0; i < exp_max_arr.length; i++) {
			if(i==0){
				exp_max_arr[i] =exp_sum[i+K-1] - 0;
			}else{
				exp_max_arr[i] =exp_sum[i+K-1] - exp_sum[i-1];
			}


			if (max<=exp_max_arr[i]) {
				max = exp_max_arr[i];
			}
		}
      
		System.out.println(max);
      	
    }
		
}
