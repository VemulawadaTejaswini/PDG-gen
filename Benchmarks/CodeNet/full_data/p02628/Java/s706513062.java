import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	private static int counter = 0;
	private static int upperOrder = 0;
	private static int lowerOrder = 0;
	
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		int pos = 0;
		int res = 0;
		while (k > 0) {
			res += nums[pos];
			pos++;
			k--;
		}
		
		System.out.println(res);
	}
	
	public static void permuteHelper(int[] nums, int start, int end, List<String> ans) {
        if (start == end) {
            String str = "";
            for (int num: nums) {
                str += ("" + num);
            }
            ans.add(str);
        } else {
            for (int i = start; i < end; i++) {
                swap(nums, i, start);
                permuteHelper(nums, start + 1, end, ans);
                swap(nums, i, start);
            }
        }
    }
	
	static public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
	
	static boolean isEqual(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
	          e.printStackTrace();
	        }
	      }
	      return st.nextToken();
	    }
	
	    int nextInt() {
	      return Integer.parseInt(next());
	    }
	
	    long nextLong() {
	      return Long.parseLong(next());
	    }
	
	    double nextDouble() { 
	      return Double.parseDouble(next());
	    }
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}
