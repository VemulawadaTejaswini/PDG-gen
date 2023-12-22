import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		ArrayList<Integer> P = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			P.add(stdIn.nextInt() - 1);
		}
		for(int i = 0; i < N; i ++) {
			C.add(stdIn.nextInt());
		}
		
		ArrayList<Long> maxSum = new ArrayList<Long>();
		
		for(int i = 0; i < N; i ++) {
			int index = i;
			long max = C.get(i);
			long sum = C.get(i);
			for(int j = 1; j < K; j ++) {
				index = P.get(index);
				if(index == i) {
					if(0 < sum) {
						int cycleCost = j;
						long subMax = (K / cycleCost) * sum;
						for(int k = 0; k < K % cycleCost; k ++) {
							subMax += C.get(index);
							max = Math.max(max, subMax);
							index = P.get(index);
						}
					}
					break;
				}else {
					sum += C.get(index);
					max = Math.max(max, sum);
				}
			}
			maxSum.add(max);
		}
		
		Collections.sort(maxSum);
		System.out.println(maxSum.get(N - 1));
	}
}