import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i < str.length(); i++) {
		    for (int j = 1; j <= k && i + j <= str.length(); j++) {
		        set.add(str.substring(i, i +j));
		    }
		}
		int idx = 1;
		for (String s : set) {
		    if (idx == k) {
		        System.out.println(s);
		        return;
		    }
		    idx++;
		}
	}
}
