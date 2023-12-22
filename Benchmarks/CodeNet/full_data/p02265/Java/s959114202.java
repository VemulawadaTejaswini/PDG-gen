import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		runProcessing();
	}
	
	public static void printNums(final int[] nums, final int last) {
		final StringBuilder result = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		
		boolean isFirst = true;
		for (int i = nums.length-1; last <= i; --i) {
			if (nums[i] < 0) continue;
			
			result.append(isFirst ? "" : " ").append(nums[i]);
			if (isFirst) isFirst = false;
		}
		System.out.println(result.toString());
	}

	public static void runProcessing() throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final int n = Integer.parseInt(reader.readLine());
		
		int last = 0;
		final int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			final String[] command = reader.readLine().split(" ");
			
			if ("insert".equals(command[0])) {
				nums[i] = Integer.parseInt(command[1]);
				
			} else if ("delete".equals(command[0])) {
				nums[i] = -1;
				
				final int del = Integer.parseInt(command[1]);
				for (int j = i-1; last <= j; --j) {
					if (nums[j] == del) {
						nums[j] = -1;
						break;
					}
				}
			} else if ("deleteFirst".equals(command[0])) {
				nums[i] = -1;
				
				for (int j = i-1; last <= j; j--) {
					if (nums[j] != -1) {
						nums[j] = -1;
						break;
					}
				}
			} else if ("deleteLast".equals(command[0])) {
				nums[i] = -1;
				
				for (int j = last; j < i; ++j) {
					if (nums[j] != -1) {
						nums[j] = -1;
						last = j;
						break;
					}
				}
			}
		}
		
		printNums(nums, last);
	}
}