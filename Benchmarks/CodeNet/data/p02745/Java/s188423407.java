
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static String[] abc = new String[3];

	public static String Check(String a, String b) {
		String ret = "";
		for(int i = 0; i < Math.min(a.length(), b.length()); i++) {
			if(b.charAt(i) == '?') {
				ret += a.charAt(i);
			} else if(a.charAt(i) == '?' || a.charAt(i) == b.charAt(i)) {
				ret += b.charAt(i);
			} else {
				ret = "!";
				return ret;
			}
		}
		if(a.length() > b.length()) {
			ret += a.substring(b.length());
		} else if(b.length() > a.length()) {
			ret += b.substring(a.length());
		}
		return ret;
	}

	public static int Match() {
		String ans = abc[0];
		for(int j = 1; j < 3; j++) {
			for(int i = 0; i < ans.length() + 1; i++) {
				if(i == ans.length()) {
					ans += abc[j];
					break;
				} else {
					String ret = Check(ans.substring(i), abc[j]);
					if(ret.equals("!"))
						continue;
					else {
						ans = ans.substring(0, i) + ret;
						break;
					}
				}
			}
		}
		return ans.length();
	}

	public static int Calc(List<String> list, int num) {
		if(list.isEmpty()) {
			return Match();
		} else {
			int ans = 10000;
			for(int i = 0; i < 3 - num; i++) {
				abc[num] = list.get(i);
				List<String> ret = new ArrayList<>(list);
				ret.remove(i);
				ans = Math.min(ans, Calc(ret, num + 1));
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		List<String> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		int ans = Calc(list, 0);
		System.out.println(ans);

	}

}
