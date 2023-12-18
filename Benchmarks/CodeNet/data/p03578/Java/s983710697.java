import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		int n = sc.nextInt();
		PriorityQueue<Long>pq=new PriorityQueue<>();
		List<Long> s2 = new ArrayList<>();

		long x = 0;
		for (int i = 0; i < n; i++) {
			long c = sc.nextLong();
			pq.offer(c);
		}
		long y = 0;
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			long c = sc.nextLong();			
			s2.add(c);
		}
		for (Long l1 : s2) {
			if (pq.contains(l1)) {
				pq.remove(l1);
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");

	}
	 static class FastReader
	    {
	        BufferedReader br;
	        StringTokenizer st;
	 
	        public FastReader()
	        {
	            br = new BufferedReader(new
	                     InputStreamReader(System.in));
	        }
	 
	        String next()
	        {
	            while (st == null || !st.hasMoreElements())
	            {
	                try
	                {
	                    st = new StringTokenizer(br.readLine());
	                }
	                catch (IOException  e)
	                {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }
	 
	        int nextInt()
	        {
	            return Integer.parseInt(next());
	        }
	 
	        long nextLong()
	        {
	            return Long.parseLong(next());
	        }
	 
	        double nextDouble()
	        {
	            return Double.parseDouble(next());
	        }
	 
	        String nextLine()
	        {
	            String str = "";
	            try
	            {
	                str = br.readLine();
	            }
	            catch (IOException e)
	            {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }

}
