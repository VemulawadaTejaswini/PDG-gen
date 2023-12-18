import java.util.*;

public class Main {
	public static Scanner in = new Scanner(System.in);
	public static void main(String ... args) {
		
		int n = in.nextInt();
		int k = in.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int [] dp = new int[n+1];
		dp[0]=0;
		for(int i=0;i<dp.length;i++) {
			for(int j=i+1;j<=k;j++) {
				if(j<n) {
					dp[j] = Math.min(dp[j],dp[i]+Math.abs(a[i]-a[j]));
				}
			}
		}

		System.out.println(dp[n]);

	}
	static int currentDrawBack(int a,int b,int c, int d) {
		int max= Math.max(a,b);
		int min = Math.min(c,d);
		return min-max+1;
	}
	private static String whoWin(int [] a) {
		TreeMap<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());
		for(int n:a) {
			map.put(n,map.getOrDefault(n,0)+1);
		}
		for(Map.Entry<Integer,Integer> m:map.entrySet()) {
			if(m.getValue()%2==1) return "Conan";
		}
		return "Agasa";
	}
	private static boolean check(int n) {
		return n>=97 && n<=122;
	}
	private static int convert(int first, int second) {
        int k = 1;
        int equation = second-first+k*26;
        while(equation<97) {
            k++;
            equation = second-first+k*26;
        }
        return equation;
    }
	private static int [] prefixSum(int [] a) {
		int [] prefix = new int[a.length+1];
		for(int i=1;i<a.length;i++) {
			prefix[i] = prefix[i-1] + a[i-1];
		}
		return prefix;
	}
	private static int [] charFrequency(String a) {
		int [] freq = new int[26];
		char [] cc = a.toCharArray();
		for(char c : cc) {
			freq[c-'a']++;
		}
		return freq;
	}
}