import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scin = new Scanner(System.in);
		int num_list_length = Integer.parseInt(scin.nextLine());
		int[] searchable_nums = new int[num_list_length];
		String[] unparsed_nums = scin.nextLine().split(" ");
		for (int i = 0; i < unparsed_nums.length; i++) {
			searchable_nums[i] = Integer.parseInt(unparsed_nums[i]);
		}
		
		num_list_length = Integer.parseInt(scin.nextLine());
		int[] query = new int[num_list_length];
		unparsed_nums = scin.nextLine().split(" ");
		for (int i = 0; i < unparsed_nums.length; i++) {
			query[i] = Integer.parseInt(unparsed_nums[i]);
		}
		
		System.out.println(searchNumsBinary(searchable_nums, query));
	}
	
	public static int searchNumsBinary(int[] nums, int[] query) {
		int output = 0;
		for (int j = 0; j < query.length; j++) {
			int tgtquerynum = query[j];
		    int low = 0, high = nums.length - 1;
		    while (low <= high) {
		        int mid = (low + high) / 2;
		        if (nums[mid] < tgtquerynum) {
		            low = mid + 1;
		        } else if (nums[mid] > tgtquerynum) {
		            high = mid - 1;
		        } else if (nums[mid] == tgtquerynum) {
		            output += 1;
		            break;
		        }
		    }
		}
		return output;
	}
}
