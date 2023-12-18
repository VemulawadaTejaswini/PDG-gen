import java.util.*;

public class Main {
	static char[] arr;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		arr = sc.next().toCharArray();
		HashSet<Character> set = new HashSet<>();
		int end = arr.length - 1;
		ArrayList<Suffix> list = new ArrayList<>();
		TreeSet<Integer>[] sets = new TreeSet[26];
		for (int i = 0; i < 26; i++) {
			sets[i] = new TreeSet<Integer>();
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			char c = arr[i];
			set.add(c);
			sets[c - 'a'].add(i);
			if (set.size() == 26) {
				list.add(new Suffix(i, end));
				end = i - 1;
				set.clear();
			}
		}
		list.add(new Suffix(0, end));
		StringBuilder sb = new StringBuilder();
		char last = 'a';
		for (int i = list.size() - 1; i >= 0; i--) {
			int idx = -1;
			Suffix suf = list.get(i);
			if (i != list.size() - 1) {
				idx = sets[last - 'a'].higher(suf.start - 1);
			}
			for (int j = 0; j < 26; j++) {
				Integer next = sets[j].higher(idx);
				if (next == null || next.intValue() > suf.end) {
					last = (char) (j + 'a');
					sb.append(last);
					break;
				}
			}
		}
		System.out.println(sb);
	}
	
	static class Suffix {
		int start;
		int end;
		public Suffix(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (int i = start; i <= end; i++) {
				sb.append(arr[i]);
			}
			return sb.toString();
		}
	}
}
