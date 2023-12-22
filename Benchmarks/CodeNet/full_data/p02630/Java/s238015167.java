import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int nums = inputs.nextInt();
		//the number there and and alues are the indices
		HashMap<Long,ArrayList<Integer>> map = new HashMap<>();
		long[] n = new long[nums];
		long sum = 0;
		for(int i=0;i<nums;i++) {
			long tem = inputs.nextLong();
			n[i] = tem;
			if(!map.containsKey(tem)) {
				map.put(tem, new ArrayList<>());
			}
			map.get(tem).add(i);
			sum+=tem;
		}
		long Q = inputs.nextLong();
		for(long i=0;i<Q;i++) {
			long C = inputs.nextLong();
			long A = inputs.nextLong();
			if(!map.containsKey(C)) {
				System.out.println(sum);
				continue;
			}
			for(int ind:map.get(C)) {
				long diff = A-n[ind]; 
				n[ind] = A;
				if(!map.containsKey(A)) {
					map.put(A, new ArrayList<>());
				}
				map.get(A).add(ind);
				sum+=diff;
			}
			System.out.println(sum);
		}
	}

}
