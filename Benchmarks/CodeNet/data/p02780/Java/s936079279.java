import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int num_arr[] = new int[N];
		double exp_arr[] = new double[N];
		// boolean flag = true;
		//格納
		//期待値算出
		for (int i = 0; i < N; i++) {
			num_arr[i] = sc.nextInt();
			exp_arr[i] = (double)(1+num_arr[i])/2;
		}
		
		double exp_sum_arr[] = new double[N-K+1];
		
		for (int i = 0; i < exp_sum_arr.length; i++) {
			for (int j = i; j < i+K; j++) {
				exp_sum_arr[i] += exp_arr[j];

			}
			
		}
      	Arrays.sort(exp_sum_arr);
		System.out.println(exp_sum_arr[N-K]);
      	
    }
		
}
