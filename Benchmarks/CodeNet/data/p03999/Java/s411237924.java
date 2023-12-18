import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<String> results = new Vector<String>();
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		char[] chars = string.toCharArray();
		int l = string.length();
		int k = (int) Math.pow(2, l - 1);
		for (int i = 0; i < k; ++i) {
			String result = "" + chars[0];
			String b = Integer.toBinaryString(i);
			int bl = b.length();
			int pp = l - 1;
			int minus = pp - bl;
			String oo = "";
			for (int q = 0; q < minus; ++q) {
				oo += "0";
			}
			b = oo + b;
			for (int j = 0; j < l - 1; ++j) {
				char t = b.charAt(j);
				if (t == '0') {
					result += chars[j + 1];
				} else {
					result += '+';
					result += chars[j + 1];
				}
			}
			//System.out.println(result);
			results.add(result);

		}
		int ss = results.size();
		long rr = 0;
		for (int w = 0; w < ss; ++w) {
			 rr += cal(results.get(w));
		}
		System.out.println(rr);

	}
	
	public static void main2(String[] args) {
		cal("17+2");
	}
	
	

	public static long cal(String s) {
		//System.out.println(s);
		long r = 0;
		if (!s.contains("+")) {
			return Long.parseLong(s);
			
		}
		String[] m = s.split("\\+");
		int size = m.length;
		for (int i = 0; i < size; ++i) {
			//System.out.println(m[i]);
			long k = Long.parseLong(m[i]);
			r += k;

		}
		return r;
	}
}
