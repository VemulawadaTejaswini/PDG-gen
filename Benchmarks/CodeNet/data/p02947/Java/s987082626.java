
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static String Calc(String s) {
		int[] cnt = new int[26];
		for(int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - 'a']++;
		}
		String ret = "";
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < cnt[i]; j++) {
				char c = (char) ('a' + i);
				ret += c;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Pair> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			s = Calc(s);
			int l = -1;
			int r = list.size();
			while(l + 1 != r) {
				int middle = (l + r) / 2;
				String val = list.get(middle).getS();
				if(val.compareTo(s) == 1 || val.compareTo(s) == 0) {
					r = middle;
				} else {
					l = middle;
				}
			}
			if(r < list.size() && s.equals(list.get(r).getS())) {
				list.set(r, new Pair(s, list.get(r).getNum() + 1));
			} else {
				list.add(r, new Pair(s, 1));
			}
		}
		long ans = 0;
		for(Pair e : list) {
			long cnt = e.getNum();
			cnt = cnt * (cnt - 1) / 2;
			ans += cnt;
		}
		System.out.println(ans);

	}

}

class Pair {
	private String s;
	private int num;

	protected Pair(String s, int num) {
		super();
		this.s = s;
		this.num = num;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
