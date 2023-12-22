import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int length = sc.nextInt();
			ArrayList<Integer> nextList = new ArrayList<>();
			ArrayList<Integer> prevList = new ArrayList<>();
			ArrayList<Integer> nums = new ArrayList<>();
			for(int i = 0; i < length; i++) {
				int tmp = sc.nextInt();
				nextList.add(tmp);
				prevList.add(tmp);
				nums.add(tmp);
			}
			if(prevPermutation(prevList)) {
				printList(prevList);
			}
			printList(nums);
			if(nextPermutation(nextList)) {
				printList(nextList);
			}
		}
	}
	@SuppressWarnings("rawtypes")
	public static void printList(List list) {
		Iterator itr = list.iterator();
		if(itr.hasNext()) {
			System.out.print(itr.next());
			while(itr.hasNext()) {
				System.out.print(" " + itr.next());
			}
		}
		System.out.println();
	}
	public static boolean nextPermutation(ArrayList<Integer> nums) {
		if(nums.size() < 2) return false;
		int i = nums.size() - 2;
		for(;i >= 0 && nums.get(i) > nums.get(i+1);i--);
		if(i<0) return false;
		int j = i + 1;
		int k = nums.size() - 1;
		for(;nums.get(i) > nums.get(k); k--);
		int tmp = nums.get(i);
		nums.set(i, nums.get(k));
		nums.set(k, tmp);
		@SuppressWarnings("unchecked")
		List<Integer> tmpList = (List<Integer>) nums.clone();
		Collections.reverse(tmpList);
		while(tmpList.size()>nums.size() - j) tmpList.remove(tmpList.size()-1);
		while(nums.size()>j) nums.remove(nums.size()-1);
		nums.addAll(tmpList);
		return true;
	}
	public static boolean prevPermutation(ArrayList<Integer> nums) {
		if(nums.size() < 2) return false;
		int i = nums.size() - 2;
		for(;i >= 0 && nums.get(i) < nums.get(i+1);i--);
		if(i<0) return false;
		int j = i + 1;
		int k = nums.size() - 1;
		for(;nums.get(i) < nums.get(k); k--);
		int tmp = nums.get(i);
		nums.set(i, nums.get(k));
		nums.set(k, tmp);
		@SuppressWarnings("unchecked")
		List<Integer> tmpList = (List<Integer>) nums.clone();
		Collections.reverse(tmpList);
		while(tmpList.size()>nums.size() - j) tmpList.remove(tmpList.size()-1);
		while(nums.size()>j) nums.remove(nums.size()-1);
		nums.addAll(tmpList);
		return true;
	}
}
