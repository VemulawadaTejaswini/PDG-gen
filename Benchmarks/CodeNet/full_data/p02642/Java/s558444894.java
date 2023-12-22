import java.util.*;
import java.io.*;
public class Main{
	static int[] a;
	static ArrayList<Integer> x = new ArrayList<Integer>();
   public static void main(String[] main) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      PrintWriter out = new PrintWriter(System.out);
      int n = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      a = new int[n];
      for(int i = 0; i < n; i++)
          a[i] = Integer.parseInt(st.nextToken());
      Arrays.sort(a);
      sieve();
      out.println(x.size());
      out.close();
   }
   static void sieve() {
	   boolean[] dp = new boolean[1000001];
	   for(int i = 0; i < dp.length; i++)
		   dp[i] = true;
	   HashSet<Integer> elements = new HashSet<Integer>();
	   HashSet<Integer> dup = new HashSet<Integer>();
	   for(int i = 0; i < a.length; i++) {
		   if(elements.contains(a[i]))
			   dup.add(a[i]);
		   elements.add(a[i]);
		   if(!dup.contains(a[i]) && dp[a[i]] && a[i] <= 500000) {
			   for(int j = a[i]*2; j < 1000001; j += a[i]) {
				   dp[j] = false;
			   }
		   }
	   }
	   for(int i = 0; i < a.length; i++)
		   if(dp[a[i]] && !dup.contains(a[i]))
			   x.add(a[i]);
   }
}