import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
        @@@@@@           @@@@@@
      @@@@@@@@@@       @@@@@@@@@@ 
    @@@@@@@@@@@@@@   @@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@
        @@@@@@@@@@@@@@@@@@@@@@@
          @@@@@@@@@@@@@@@@@@@
            @@@@@@@@@@@@@@@
              @@@@@@@@@@@
                @@@@@@@
                  @@@
                   @ 
*/
public class Main {
	static long mod = 1000000021;
	static long mod2 = 1000000007;
		public static long modpower(long num, long power, long mod) {
			if (power==0) return 1L;
			if (power==1) return num%mod;
			long ret = modpower(num, power/2, mod);
			if (power%2==0) return (ret*ret)%mod;
			return (((ret*ret)%mod)*num)%mod;
		}
	

	public static void main(String[] args) throws Exception{
		int n = i();
		String[] s = new String[n];
		for (int i=0; i<n; i++) {
			s[i] = s();
		}
		
		pair[] stuff = new pair[n];
		pair[] stuff2 = new pair[n];
		int[] temp = new int[26];
		for (int i=0; i<n; i++) {
			temp = new int[26];
			stuff[i] = new pair(0, i);
			stuff2[i] = new pair(0, i);
			for (int j=0; j<10; j++) {
				temp[s[i].charAt(j)-'a']++;
			}
			for (int j=0; j<26; j++) {
				stuff[i].x = (stuff[i].x+temp[j]*modpower(26, 9-j, mod))%mod;
				stuff2[i].x = (stuff2[i].x+temp[j]*modpower(26, 9-j, mod2))%mod2;
			}
		}
		Arrays.sort(stuff);
		long eq = 1;
		long ret = 0;
		for (int i=1; i<n; i++) {
			if (stuff[i].x==stuff[i-1].x && stuff2[stuff[i].y].x==stuff2[stuff[i-1].y].x) eq++;
			else {
				ret+=eq*(eq-1)/2;
				eq = 1;
			}
		}
		ret+=eq*(eq-1)/2;
		System.out.println(ret);
	}
	
	public static class pair implements Comparable<pair>{
		long x;
		int y;
		public pair(long a, int b) {
			x = a;
			y = b;
		}
			
		public int compareTo(pair k) {
			if (x>k.x) return 1;
			if (x<k.x) return -1;
			if (y>k.y) return 1;
			if (y<k.y) return -1;
			return 0;
		}
	}
	
	static BufferedReader in;
	static StringTokenizer st = new StringTokenizer("");
	//static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static PrintWriter out;
	static {
		try {
			in = Files.newBufferedReader(Paths.get("TEMPLATE.in"));
			out = new PrintWriter(new BufferedWriter(new FileWriter("TEMPLATE.out")));
		} catch (Exception e) {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		}
	}
	/*static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}*/
	static void check() throws Exception {
		while (!st.hasMoreTokens()) st = new StringTokenizer(in.readLine());
	}
	static String s() throws Exception { check(); return st.nextToken(); }
	static int i() throws Exception { return Integer.parseInt(s()); }
	static long l() throws Exception { return Long.parseLong(s()); }
	static double d() throws Exception { return Double.parseDouble(s()); }
}
