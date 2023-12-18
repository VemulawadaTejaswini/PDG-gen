import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder st = new StringBuilder("");
		StringBuilder ss = new StringBuilder(s);
		long k = sc.nextLong();
		long count = 0;
		char del = '$';
		int n = (int) s.length();
		for(int i = 0; i < n; i++)
			st.append(s.charAt(0));
		if (st ==  ss)
			System.out.println(s.length() * (k / 2));
		else {
		for (int i = 0; i < ss.length() - 1; i++){
			if (ss.charAt(i % n) == ss.charAt((i + 1) % n)){
				// ss.setCharAt(i + 1, del);
				count++;
				i++;
				}
			}
		int count1 = 0;
		for (int i = 0; i + 1 < 2 * n ; i++){
			if (ss.charAt(i % n) == ss.charAt((i + 1) % n)){
				// ss.setCharAt(i + 1, del);
				count1++;
				i++;
			}
		}
			System.out.println(count + (count1 - count) * (k - 1));
		}
	}
}
