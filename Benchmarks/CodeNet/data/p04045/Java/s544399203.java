import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] Alldigits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i=0; i<k; i++) 
			Alldigits[in.nextInt()] = -1;
		
		ArrayList<Integer> digits = new ArrayList<>();
		for (int i: Alldigits) if (i != -1)
			digits.add(i);
		int[] num = toIntArray(n);
		num[0] = -1;
		
		num = replaceBadDigits(num, digits);
		
		while(isSmaller(num, n))
			num = increment(num, digits);
		
		String res = "";
		for (int i=0; i<num.length; i++) if (num[i] != -1) {
			res += Integer.toString(num[i]);
		}
		System.out.println(res);
	}
	
	public static int[] toIntArray(int n) {
		int numDigits = Integer.toString(n).length();
		int[] arr = new int[numDigits + 1];
		
		int pos = numDigits;
		while (n > 0) {
			arr[pos--] = n%10;
			n /= 10;
		}
		return arr;
	}
	
	public static int[] replaceBadDigits(int[] num, ArrayList<Integer> digits) {
		boolean done = false;
		int pos = 2;
		for (int i=1; i<num.length; i++) {
			if (!digits.contains(num[i])) {
				done = true;
				if (i == 1 && digits.get(0) == 0)
					num[i] = digits.get(1);
				else
					num[i] = digits.get(0);
			}
			if (done)
				break;
			++pos;
		}
		
		for (int i=pos; i<num.length; i++)
			num[i] = digits.get(0);
		return num;
	}
	
	public static boolean isSmaller(int[] num, int n) {
		String str = "";
		for (int i=0; i<num.length; i++) if (num[i] != -1)
			str += Integer.toString(num[i]);
		int N = Integer.parseInt(str);
		return n > N;
	}
	
	public static int[] increment(int[] num, ArrayList<Integer> digits) {
		int place = num.length-1;
		while (true) {
			int pos = digits.indexOf(num[place]) + 1;
			if (pos < digits.size()) {
				num[place] = digits.get(pos);
				break;
			}
			else {
				num[place--] = digits.get(0);
			}
		}
		if (num[0] == 0)
			num[0] = digits.get(1);
		return num;
	}
	
	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
