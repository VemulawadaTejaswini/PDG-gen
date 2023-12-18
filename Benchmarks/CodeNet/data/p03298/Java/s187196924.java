import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		String l = s.substring(0, n);
		String r = reverse(s.substring(n, 2*n));
		Map<Pair,Long> mapl = countPair(l,n);
		Map<Pair,Long> mapr = countPair(r,n);
		long count = 0;
		for(Pair pair : mapl.keySet()) {
			if(mapr.containsKey(pair)) {
				count += mapl.get(pair) * mapr.get(pair);
			}
		}
		System.out.println(count);
	}
	
	public static Map<Pair,Long> countPair(String s,int n){
		Map<Pair,Long> map = new HashMap<>();
		long expN = 1<<n;
		for(long i=0;i<expN;i++) {
			long classifer = i;
			StringBuilder sbRed = new StringBuilder();
			StringBuilder sbBlue = new StringBuilder();
			for(int digit=0;digit<n;digit++) {
				int color = (int) (classifer % 2);
				if(color==0) sbRed.append(s.charAt(digit));
				else sbBlue.append(s.charAt(digit));
				classifer /= 2;
			}
			Pair pair = new Pair(sbRed.toString(),sbBlue.toString());
			map.put(pair, map.get(pair).longValue()+1);
		}
		return map;
	}
	
	public static String reverse(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	public static class Pair{
		private String red;
		private String blue;
		public Pair(String red,String blue) {
			this.red = red;
			this.blue = blue;
		}
		public String getRed() {
			return red;
		}
		public String getBlue() {
			return blue;
		}
	}
}