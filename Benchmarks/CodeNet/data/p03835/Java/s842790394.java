import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		int[] nums = new int[k+1];
		
		for(int i=0; i<=k; i++) {
			nums[i] = i;
		}
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		dfs(lists, list, nums, 0, s);
		System.out.println(lists.size());
    }

	private static void dfs(List<List<Integer>> lists, List<Integer> list, 
			int[] nums, int start, int s) {
		
		if(start == 3) {
			int sum = 0;
			for(int i=0; i<list.size(); i++) {
				sum += list.get(i);
			}
			if(sum == s) {
				lists.add(new ArrayList<Integer>(list));
			}
		}else {
			for(int i=0; i<nums.length; i++) {
				list.add(nums[i]);
				dfs(lists, list, nums, start+1, s);
				list.remove(list.size()-1);
			}
		}
	}

}
