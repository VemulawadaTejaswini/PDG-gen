
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 079
	// https://atcoder.jp/contests/abc079/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String ticket = sc.next();
		int[] tickets = new int[ticket.length()];
		
		for (int i = 0; i < ticket.length(); i++) {
			tickets[i] = ticket.charAt(i) - '0';
		}
		findTicket(tickets, "" + tickets[0], 1, tickets[0]);
	}
	
	private static void findTicket(int[] nums, String s, int curr, int sum) {
		if (s.length() == 7) {
			if (sum == 7) {
				System.out.println(s + "=7");
				System.exit(0);
			} 
		} else {
			if (curr < nums.length) {
				findTicket(nums, s + "+" + nums[curr], curr+1, sum + nums[curr]);
				findTicket(nums, s + "-" + nums[curr], curr+1, sum - nums[curr]);
			}
		}
		
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
