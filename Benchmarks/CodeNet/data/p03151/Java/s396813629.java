import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numa = new int[n];
		int[] numb = new int[n];
		
		for(int i=0; i<n; i++) {
			numa[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			numb[i] = sc.nextInt();
		}
		List<List<Integer>> solution = solution(numa);
		for(int i=0; i<solution.size(); i++) {
			List<Integer> list = solution.get(i);
			for(int j=0; j<list.size(); j++) {
				if(numb[j] > list.get(j)) {
					solution.remove(i);
				}
			}
		}
		if(solution.size()==0) {
			System.out.println(-1);
		}else {
			System.out.println(solution.size());
		}
	}
	
	public static List<List<Integer>> solution(int[] nums){
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		dfs(lists, list, nums, 0);
		return lists;
	}

	private static void dfs(List<List<Integer>> lists, List<Integer> list, int[] nums, int start) {
		
		if(start > nums.length) {
			return;
		}else if(start == nums.length) {
			lists.add(new ArrayList<Integer>(list));
		}else {
			for(int i=0; i<nums.length; i++) {
				if(list.contains(nums[i])) {
					continue;
				}
				list.add(nums[i]);
				dfs(lists, list, nums, start+1);
				list.remove(list.size()-1);
			}
		}
	}
}
