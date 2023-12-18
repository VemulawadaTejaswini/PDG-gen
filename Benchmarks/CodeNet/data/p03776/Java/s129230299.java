

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int MIN = sc.nextInt();
		int MAX = sc.nextInt();

		Long[] values = new Long[N];

		for(int i = 0;i < N;i++){
			values[i] = sc.nextLong();
		}

		Arrays.parallelSort(values,new Comparator<Long>() {
			public int compare(Long l1,Long l2){
				return (int)(l2 - l1);
			}
		});


		Long sum = Long.valueOf(0);

		for(int i = 0;i < MIN;i++){
			sum += values[i];
		}

		Long min_value = values[MIN - 1];
		Long inner_min_value_count = new Long(0);
		Long min_value_count = new Long(0);

		for(int i = MIN - 1;0 <= i;i--){
			if(values[i] != min_value)break;
			min_value_count++;
			inner_min_value_count++;
		}

		for(int i = MIN;i < N;i++){
			if(values[i] != min_value)break;
			min_value_count++;
		}

		System.out.println(String.format("%f", (sum / (double)MIN)) );

		int id = 0;
		for(;id < MIN;id++){
			if(values[id] != min_value)break;
		}

		if(id == MIN){
			long pattern_ccount = 0;
			for(long i = MIN;i <= MAX || i <= min_value_count;i++){
				long combo = combination(min_value_count,i);
				System.out.println("combo : " + combo);
				pattern_ccount += combination(min_value_count,i);
				System.out.println(pattern_ccount);
			}
			System.out.println(pattern_ccount);
		}else{
			System.out.println(combination(min_value_count, inner_min_value_count));
		}

		sc.close();
	}

	static Long combination(Long all_count,Long pickup_count){

		Long res = new Long(1);

		for(long i = 0;i < pickup_count;i++){
			res *= (all_count - i);
		}

		return res / factrial(pickup_count);
	}

	static Long factrial(Long num){
		if(num <= 0)return new Long(1);

		return num * factrial(num - 1);
	}
}
