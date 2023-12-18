
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		long firstDigitPostive = 0;

		long prefixSum = 0;
		for (int i = 0; i < nums.length; i++) {
			prefixSum += nums[i];
			if (i % 2 == 0) {
				// odd is postive
				if (prefixSum == 0) {
					prefixSum--;
					firstDigitPostive++;
				} else if (prefixSum < 0) {
					firstDigitPostive += (1 - prefixSum);
					prefixSum += 1 - prefixSum;
				}
			} else {
				// even is negative
				if (prefixSum == 0) {
					prefixSum++;
				} else if (prefixSum > 0) {
					firstDigitPostive += (1 + prefixSum);
					prefixSum -= (prefixSum + 1) ;
				}
			}
		}
		
		prefixSum = 0;
		long firstDigitNegative = 0;
		for (int i = 0; i < nums.length; i++) {
			prefixSum += nums[i];
			if (i % 2 == 0) {
				// odd is negative
				if (prefixSum == 0) {
					prefixSum++;
				} else if (prefixSum > 0) {
					firstDigitNegative += (1 + prefixSum);
					prefixSum -= (prefixSum + 1) ;
				}
			} else {
				// even is postive
				if (prefixSum == 0) {
					prefixSum--;
					firstDigitNegative++;
				} else if (prefixSum < 0) {
					firstDigitNegative += (1 - prefixSum);
					prefixSum += 1 - prefixSum;
				}
			}
		}
		
		System.out.println(Math.min(firstDigitPostive, firstDigitNegative));
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
