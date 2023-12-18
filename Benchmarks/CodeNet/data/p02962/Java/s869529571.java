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

		// StringBuilder s2 = new StringBuilder(s);
		// s2.append(s);
		// while(s2.length() < tLen * 2) {
		// 	s2.append(s);
		// }
		// s = s2.toString();

		ans = new long[sLen];
		Arrays.fill(ans, -1);
		ok = new boolean[sLen];
		Arrays.fill(ok, false);
		ArrayList<Integer> matchIndex = bm(s, t);
		System.err.println(matchIndex.size());
		for(int i = 0; i < matchIndex.size(); i ++) {
			ok[matchIndex.get(i) % sLen] = true;
		}

		long max = 0;
		for(int i = 0; i < sLen; i ++) {
			max = Math.max(max, solve(i));
		}
		System.out.println(max);
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

	static ArrayList<Integer> bm(String s, String p) {
		int size = 26;

		int sLen = s.length();
		int sInt[] = new int[sLen];
		for(int i = 0; i < sLen; i ++) {
			sInt[i] = s.charAt(i) - 'a';
		}
		int pLen = p.length();
		int pInt[] = new int[pLen];
		for(int i = 0; i < pLen; i ++) {
			pInt[i] = p.charAt(i) - 'a';
		}

		int skip[] = new int[size];
		Arrays.fill(skip, pLen);
		for(int i = 0; i < pLen; i ++) {
			skip[pInt[i]] = pLen - 1 - i;
		}

		ArrayList<Integer> matchIndex = new ArrayList<Integer>();
		int sIndex = pLen - 1;
		while(sIndex < sLen) {
			int pIndex = pLen - 1;
			while(sIndex >= 0 && pIndex >= 0 && sInt[sIndex] == pInt[pIndex]) {
				sIndex --;
				pIndex --;
			}
			if(pIndex < 0) {
				matchIndex.add(sIndex + 1);
				sIndex += pLen + 1;
			}else {
				sIndex += Math.max(skip[sInt[sIndex]], pLen - pIndex);
			}
		}
		return matchIndex;
	}
}