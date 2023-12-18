import java.util.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(findSubstring(scanString(), scanInt()));
	}
	
	private static String findSubstring(String s, int K) {
		Dict dict = new Dict(K);
		for (int i = 0; i < s.length(); ++i) {
			for (int j = i + 1; j <= s.length(); ++j) {
				dict.append(s.substring(i, j));
			}
		}
		return dict.last();
	}

	private static class Dict {
		private final int K;
		
		private final ArrayList<String> dict;
		
		private Dict(int K) {
			this.K = K;
			this.dict = new ArrayList<>(K + 1);
		}
		
		private String last() {
			return dict.get(K - 1);
		}
		
		private boolean append(String ss) {
			if (dict.isEmpty()) {
				dict.add(ss);
				return true;
			}
			
			int p = Integer.MAX_VALUE;
			for (int i = dict.size() - 1; 0 <= i; --i) {
				int r = ss.compareTo(dict.get(i));
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
				dict.add(ss);
			} else {
				if (p < 0 || K <= p) {
					return false;
				}
				dict.add(p, ss);
			}
			if (K < dict.size()) {
				dict.remove(K);
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
