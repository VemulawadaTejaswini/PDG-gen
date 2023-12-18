import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int n = inputs.nextInt();
		Long[] nums = new Long[n];
		//stores value, how many
		HashMap<Long,Long> map = new HashMap<Long,Long>();
		for(int i=0;i<n;i++) {
			nums[i]=inputs.nextLong();
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 0L);
			}
			map.put(nums[i], map.get(nums[i])+1);
		}
		long tot = 0;
		Set<Long> temp = map.keySet();
		for(Long i:temp) {
			long curr = map.get(i);
			if(curr>=2) {
				tot+=comb(curr);
			}
		}
		for(int k=0;k<n;k++) {
			long sum =tot;
			long bad = nums[k];
			long am = map.get(bad);
			if(am>=2) {
				sum+= (-1*am+1);
			}
			System.out.println(sum);
		}
		
	}
	static long comb(long n)
	{
		return n*(n-1)/2;
	}
}
