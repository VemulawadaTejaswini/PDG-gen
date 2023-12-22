import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int mod = 998244353;
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> R = new ArrayList<Integer>();
		for(int i = 0; i < K; i ++) {
			L.add(stdIn.nextInt());
			R.add(stdIn.nextInt());
		}
		
		ArrayList<Long> A = new ArrayList<Long>();
		A.add((long) 0);
		A.add((long) 1);
		ArrayList<Long> Sum = new ArrayList<Long>();
		Sum.add((long) 0);
		Sum.add((long) 1);
		
		for(int i = 2; i <= N; i ++) {
			long addNum = 0;
			for(int j = 0; j < K; j ++) {
				int idxL = i - R.get(j) - 1;
				int idxR = i - L.get(j);
				if(idxR <= 0) {
					continue;
				}else if(idxL < 0 && 0 <idxR) {
					addNum += (Sum.get(idxR) - Sum.get(0)) % mod;
				}else {
					addNum += (Sum.get(idxR) - Sum.get(idxL)) % mod;
				}
			}
			A.add(addNum);
			Sum.add(Sum.get(Sum.size() - 1) + addNum);
		}
      
		System.out.println(A.get(A.size() - 1) % mod);
	}
}