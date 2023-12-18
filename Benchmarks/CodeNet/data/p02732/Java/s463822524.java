import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int n = inputs.nextInt();
		int[] nums = new int[n];
		//stores value, how many
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			nums[i]=inputs.nextInt();
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 0);
			}
			map.put(nums[i], map.get(nums[i])+1);
		}
		/*
		Set<Integer> set = map.keySet();
		for(Integer i:set) {
			if(map.get(i)<2) {
				map.remove(i);
			}
		}
		*/
		for(int k=0;k<n;k++) {
			int sum =0;
			int bad = nums[k];
			Set<Integer> temp = map.keySet();
			for(Integer i:temp) {
				int curr = map.get(i);
				if(i==bad) {
					curr--;
				}
				if(curr>=2) {
					sum+=comb(curr,2);
				}
			}
			System.out.println(sum);
		}
		
	}
	static int comb(int n , int r)
	{
		if( r== 0 || n == r)
			return 1;
		else
			return comb(n-1,r)+comb(n-1,r-1);
	}
}
