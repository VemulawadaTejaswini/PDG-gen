import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int SIZE = 100005;
	static int[] even = new int[SIZE];
	static int[] odd = new int[SIZE];
	static String[] evenStr = null;
	static String[] oddStr = null;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			int v = sc.nextInt();
			if(i % 2 == 0) ++even[v];
			else ++odd[v];
		}
		
		evenStr = getSortedArray(even);
		oddStr = getSortedArray(odd);
		
		if(getNumber(evenStr[0]) != getNumber(oddStr[0])) {
			System.out.println(n - getAppearCount(evenStr[0]) - getAppearCount(oddStr[0]));
		}else{
			int ans = Math.min(n - getAppearCount(evenStr[0]) - getAppearCount(oddStr[1]), n - getAppearCount(evenStr[1]) - getAppearCount(oddStr[0]));
			System.out.println(ans);
		}
	}
	
	static String getFormattedString(int numAppear, int num) {
		StringBuilder sb = new StringBuilder();
		sb.append(numAppear);
		sb.append(':');
		sb.append(num);
		return sb.toString();
	}
	
	static String[] getSortedArray(int[] cnt) {
		String[] res = new String[SIZE];
		for(int i = 0; i < SIZE; ++i) res[i] = getFormattedString(cnt[i], i);
		Arrays.sort(res, Comparator.reverseOrder());
		return res;
	}
	
	static int getAppearCount(String s) {
		int splitterIndex = s.indexOf(':');
		return Integer.parseInt(s.substring(0, splitterIndex));
	}
	
	static int getNumber(String s) {
		int splitterIndex = s.indexOf(':');
		return Integer.parseInt(s.substring(splitterIndex + 1));
	}
}