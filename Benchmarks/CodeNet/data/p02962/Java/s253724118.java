import java.util.*;
public class Main {
	public static int sLen;
	public static int tLen;
	public static long ans[];
	public static boolean ok[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sLen = s.length();
		tLen = t.length();

		StringBuilder s2 = new StringBuilder(s);
		s2.append(s);
		while(s2.length() < tLen * 2) {
			s2.append(s);
		}
		s = s2.toString();
		
		ans = new long[sLen];
		Arrays.fill(ans, -1);
		ok = new boolean[sLen];
		Arrays.fill(ok, false);
		ArrayList<Integer> matchIndex = bm(s, t);
		for(int i = 0; i < matchIndex.size(); i ++) {
			ok[matchIndex.get(i) % sLen] = true;
		}

		// long max = 0;
		// for(int i = 0; i < sLen; i ++) {
		// 	max = Math.max(max, solve(i));
		// }
		// System.out.println(max);
	}

	static long solve(int i) {
		i %= sLen;
		if(ans[i] == -2) {
			System.out.println(-1);
			System.exit(0);
		}else if(ans[i] == -1) {
			ans[i] = -2;
			ans[i] = (ok[i] ? (solve(i + tLen) + 1) : 0);
		}
		return ans[i];
	}

	static ArrayList<Integer> bm(String str, String ptr) {
		int size = 26;
		int strLen = str.length();
		int ptrLen = ptr.length();
		int skip[] = new int[size];
		Arrays.fill(skip, ptrLen);
		for(int i = 0; i < ptrLen; i ++) {
			skip[ptr.charAt(i) - 'a'] = ptrLen - 1 - i;
		}

		ArrayList<Integer> matchIndex = new ArrayList<Integer>();
		int strIndex = ptrLen - 1;
		while(strIndex < strLen) {
			int ptrIndex = ptrLen - 1;
			while(strIndex >= 0 && ptrIndex >= 0 && str.charAt(strIndex) == ptr.charAt(ptrIndex)) {
				strIndex --;
				ptrIndex --;
			}
			if(ptrIndex < 0) {
				matchIndex.add(strIndex + 1);
				strIndex += ptrLen + 1;
			}else {
				strIndex += Math.max(skip[str.charAt(strIndex) - 'a'], ptrLen - ptrIndex);
			}
		}
		return matchIndex;
	}
}