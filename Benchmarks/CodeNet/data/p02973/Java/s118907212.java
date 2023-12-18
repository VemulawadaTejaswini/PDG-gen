import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	private class LIS {
		LinkedList<Long> data = new LinkedList<Long>();
		boolean allowSameNumber = false;
		
		public LIS(long[] data) {
			for (int i=0; i<data.length; i++) {
				this.data.add(data[i]);
			}
		}

		private int searchUpdateIndex(long[] nums, int size, long num) {
			if (size == 0) {
				return 0;
			}
			if (allowSameNumber) {
				if (nums[size-1] <= num) {
					return size;
				} else if (num < nums[0]) {
					return 0;
				}
			} else {
				if (nums[size-1] < num) {
					return size;
				} else if (num < nums[0]) {
					return 0;
				}
			}
			int left = 0;
			int right = size-1;

			while(true) {
				int test = (right + left) / 2;
				
				if (allowSameNumber) {
					// search left <= num < right
					if (left+1 >= right) {
						return right;
					}
					if (num < nums[test]) {
						right = test;
					} else { //nums[test] <= num
						left = test;
					}
				} else {
					// search left < num < right
					if (left+1 >= right) {
						return right;
					}
					if (nums[test] == num) {
						return -1;
					} else if (num < nums[test]) {
						right = test;
					} else { //nums[test] < num
						left = test;
					}
				}
			}
		}
		
		public int getLIS() {
			if (this.data.size() == 0) {
				return 0;
			}
			int size = 0;
			long[] mins = new long[this.data.size()];
			Arrays.fill(mins, Long.MAX_VALUE);
			
			for (long n : this.data) {
				int updateIndex = searchUpdateIndex(mins, size, n);
				if (updateIndex == -1) {
					continue;
				} else {
					mins[updateIndex] = n;
					if (size < updateIndex+1) {
						size = updateIndex+1;
					}
				}
			}
			return size;
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] ds = new long[N];
		for (int i=0; i<N; i++) {
			ds[i] = 1_000_000_001 - in.nextLong();
		}
		in.close();
		
		LIS lis = new LIS(ds);
		lis.allowSameNumber = true;
		int num = lis.getLIS();
		
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
