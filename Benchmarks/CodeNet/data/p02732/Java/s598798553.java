import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc159_d_();
	}
  
  	public static void solve_abc159_d_(){

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long[] A = new long[(int)N];

		Set<Long> as = new HashSet<Long>();
		int[] ar = new int[210000];
		long[] ansr = new long[210000];
		long[] ansr_ = new long[210000];

		for(int i=0;i<N;i++){
			long ai =sc.nextLong();
			A[i] = ai;
			ar[(int)ai] += 1;
			as.add(ai);
		}
		
		for(Long asi: as){
			long key = asi.longValue();
			long value = ar[(int)key];
			
			if(value >= 2) ansr[(int)key]  = value * (value -1) / 2;
			if(value >= 3) ansr_[(int)key] = (value-1)  * (value-2) / 2;
		}

		for(int i=0;i<N;i++){

			long ai = A[i];
			long ans = 0;

			for(Long asi: as){
				int key = asi.intValue();

				if(key == ai) ans += ansr_[key];
				else ans += ansr[key];
			}

			System.out.println(ans);
		}

		sc.close();

	}
}