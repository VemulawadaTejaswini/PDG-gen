import java.util.*;
public class Main {
	static int n,l;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		n = Integer.valueOf(str[0]);
		l = Integer.valueOf(str[1]);
		List<i> list = new ArrayList<i>();
		for (int i = 0;; i++) {
			if (count == n)
				break;
			String str1 = scan.nextLine();
			if (!str1.isEmpty()) {
				list.add(new i(str1));
				count++;
			}
		}
		Collections.sort(list);
		for(int i=0;i<n;i++) {
			System.out.println(list.get(i).getStr());
		}
	}
}

class i implements java.lang.Comparable<i> {

	private String str;
	
	public i(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public int compareTo(i o) {
		int j = 0;
		int result = 0;
		while(j<str.length()) {
			result = this.str.charAt(j)-o.str.charAt(j);
			if(result == 0) {
				j++;
				result = this.str.charAt(j)-o.str.charAt(j);
			}
			else
				break;
		}
		return result;
	}
}