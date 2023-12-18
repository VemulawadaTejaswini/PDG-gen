package atcoder_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Powers_of_two_B {

	public static int solution(int n, int[] nums) {
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<>();
		int count = 0;
		subSet(lists, list, nums, 0);
		for(int i=0; i<lists.size(); i++) {
			List<Integer> tmpList = lists.get(i);
			for(int j=i+1; j<lists.size(); j++) {
				if(tmpList.containsAll(lists.get(j))) {
					lists.remove(j);
				}
			}
		}
		System.out.println(lists);
		for(int i=0; i<lists.size(); i++) {
			List<Integer>  subList = lists.get(i);
			int sum = 0;
			for(int j=0; j<subList.size(); j++) {
				sum += subList.get(j);
			}
			if((sum&(sum-1)) == 0) {
				count += 1;
			}
		}
		return count;
	}

	private static void subSet(List<List<Integer>> lists, List<Integer> list, 
			int[] nums, int start) {
		if(start > 2) {
			return;
		}else if(start == 2) {
			lists.add(new ArrayList<Integer>(list));
		}else {
			for(int i=0; i<nums.length; i++) {
				if(list.contains(nums[i])) {
					continue;
				}
				list.add(nums[i]);
				subSet(lists, list, nums, start+1);
				list.remove(list.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());
		int[] a = new int[N];
		for(int i=0;i<N;i++)a[i]=Integer.parseInt(scanner.next());
		
		int solution = solution(N, a);
		System.out.println(solution);
	}
}
