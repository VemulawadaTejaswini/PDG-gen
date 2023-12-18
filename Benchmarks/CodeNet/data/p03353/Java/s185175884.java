import java.util.*;
import static java.lang.Math.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(findSubstring(scanString(), scanInt()));
	}
	
	private static String findSubstring(String s, int K) {
		Dict dict = new Dict(K);
		String last = "";
		for (int i = 0; i < s.length(); ++i) {
			if (!last.isEmpty() && last.charAt(0) < s.charAt(i)) {
				continue;
			}
			int jj = Math.min(s.length(), i + K);
			for (int j = i + 1; j <= jj; ++j) {
				dict.append(s.substring(i, j));
			}
			last = dict.last();
		}
		return dict.last();
	}

	private static class Dict {
		private int K;
		
		private final ArrayList<String> dict;
		
		private Dict(int K) {
			this.K = K;
			this.dict = new ArrayList<>(K + 1);
		}
		
		private boolean hasLast() {
			return K <= dict.size();
		}
		
		private String last() {
			return hasLast() ? dict.get(K - 1) : "";
		}
		
		private boolean append(String ss) {
			if (dict.isEmpty()) {
				dict.add(ss);
				return true;
			}
			
			int p = Integer.MAX_VALUE;
			for (int i = dict.size() - 1; 0 <= i; --i) {
				String s = dict.get(i);
				int r = ss.compareTo(s);
				if (r < 0) {
					p = i;
				} else {
					if (r == 0) {
						p = -1;
					}
					break;
				}
			}
			if (dict.size() < K) {
				if (p < 0 || dict.size() <= p) {
					dict.add(ss);
				} else {
					dict.add(p, ss);
				}
			} else {
				if (p < 0 || K <= p) {
					return false;
				}
				dict.add(p, ss);
			}
			if (K < dict.size()) {
				String e = dict.remove(K);
			}
			return true;
		}
	}
	
	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}
