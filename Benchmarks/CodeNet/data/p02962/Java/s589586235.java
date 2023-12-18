import java.util.*;
public class Main {
	public static long ans[];
	public static boolean ok[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int sLen = s.length();
		int tLen = t.length();

		s = repeat(s, (int)Math.max(2, Math.ceil(tLen * 2.0 / sLen))).toString();

		ans = new long[sLen];
		Arrays.fill(ans, -1);
		ok = new boolean[sLen];
		Arrays.fill(ok, false);

		ArrayList<Integer> matchIndex = kmp(s, t);
		for(int i = 0; i < matchIndex.size(); i ++) {
			ok[matchIndex.get(i) % sLen] = true;
		}
		long max = 0;
		for(int i = 0; i < sLen; i ++) {
			max = Math.max(max, solve(i, sLen, tLen));
		}
		System.out.println(max);
	}

	static String repeat(String s, long y) {
		StringBuilder tmp = new StringBuilder();
		if (y == 0) {
			return "";
		} else if (y == 1) {
			return s;
		} else if (y % 2 == 0) {
			tmp.append(repeat(s, y / 2));
			tmp.append(tmp);
			return tmp.toString();
		} else {
			tmp.append(repeat(s, y / 2));
			tmp.append(tmp);
			tmp.append(s);
			return tmp.toString();
		}
	}

	static long solve(int i, int sLen, int tLen) {
		i %= sLen;
		if(ans[i] == -2) {
			System.out.println(-1);
			System.exit(0);
		}else if(ans[i] == -1) {
			ans[i] = -2;
			ans[i] = (ok[i] ? (solve(i + tLen, sLen, tLen) + 1) : 0);
		}
		return ans[i];
	}

	static ArrayList<Integer> kmp(String s, String p) {
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
	
		int sIndex = 1;
		int pIndex = 0;
	
		int skip[] = new int[pLen + 1];
		Arrays.fill(skip, 0);
		while(sIndex < pLen) {
			if(pInt[sIndex] == pInt[pIndex]) {
				sIndex ++;
				pIndex ++;
				skip[sIndex] = pIndex;
			}else if(pIndex == 0) {
				sIndex ++;
				skip[sIndex] = 0;
			}else {
				pIndex = skip[pIndex];
			}
		}
	
		ArrayList<Integer> matchIndex = new ArrayList<Integer>();
		sIndex = 0;
		pIndex = 0;
		end: while(true) {
			while(sIndex < sLen && pIndex < pLen && sInt[sIndex] == pInt[pIndex]) {
				sIndex ++;
				pIndex ++;
			}
			if(pIndex >= pLen) {
				matchIndex.add(sIndex - pLen);
				pIndex = skip[pIndex];
			}else if(pIndex == 0){
				sIndex ++;
			}else {
				pIndex = skip[pIndex];
			}
			if(sIndex >= sLen) { break end; }
		}
		return matchIndex;
	}
}