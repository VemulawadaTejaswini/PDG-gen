import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		int idx = 0;
		char prev = '0';
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i < s.length() || (set.size() < k && prev == arr[i]); i++) {
			if (arr[i] != prev) {
				idx = 0;
				prev = arr[i];
			}
			int start = s.indexOf(prev, idx);
			idx = start + 1;
			for (int j = i + 1; j <= s.length() && j - i <= 5; j++) {
				set.add(s.substring(i, j));
			}
		}
		ArrayList<String> list = new ArrayList<String>(set);
		System.out.println(list.get(k - 1));
	}
}
