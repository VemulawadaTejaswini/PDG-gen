
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) {
		FastReader r = new FastReader();
		int c = r.ri();
		int[] a = r.ria();		
		int sum = 0;
		for(int i : a)
			sum+=i;
		long target = Math.round( (1.0*sum) / c);
		int ans = 0;
		for(int i :a) {
			ans += (target-i)*(target-i);
		}
		print(ans);
	}		
	
	public static String repeat(String s, int n) {
		return String.join("", Collections.nCopies(n, s));
	}
	
	public static int getDigitSum(int n) {
		String str = ""+n;
		int sum = 0;
		for(int i = 0; i<str.length();i++) {
			sum += Integer.parseInt(""+str.charAt(i));
		}
		return sum;
	}

	public static void rolling(int[] arr) {
		if (arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
	}
	
	public static void rolling(long[] arr) {
		if (arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
	}

	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	
	public static void swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	public static void swap(long[] arr, int pos1, int pos2) {
		long temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	
	public static String al(String s) {
		return s + "\n";
	}

	public static void print(String s) {
		System.out.println(s);
	}

	public static void print(long s) {
		System.out.println(s);
	}

	public static void print(int s) {
		System.out.println(s);
	}
	
	public static void print(double s) {
		System.out.println(s);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		int ri() {
			return Integer.parseInt(str());
		}

		long rl() {
			return Long.parseLong(str());
		}

		double rd() {
			return Double.parseDouble(str());
		}

		String str() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] rsa() {
			return str().split(" ");
		}

		int[] ria() {
			String[] s = rsa();
			int[] arr = new int[s.length];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(s[i]);
			return arr;
		}
		
		List<Integer> ril() {
			List<Integer> list = new ArrayList<>();
			for(int a : ria())
				list.add(a);
			return list;
		}

		long[] rla() {
			String[] s = rsa();
			long[] arr = new long[s.length];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Long.parseLong(s[i]);
			return arr;
		}
		
		List<Long> rll() {
			List<Long> list = new ArrayList<>();
			for(long a : rla())
				list.add(a);
			return list;
		}

		char[] rca() {
			String s = str();
			char[] arr = new char[s.length()];
			for (int i = 0; i < arr.length; i++)
				arr[i] = s.charAt(i);
			return arr;
		}
		
		List<Character> rcl() {
			List<Character> list = new ArrayList<>();
			for(char a : rca())
				list.add(a);
			return list;
		}
		
		String[] rsaml(int m) {
			String[] arr = new String[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = str();
			return arr;
		}

		int[] riaml(int m) {
			int[] arr = new int[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(str());
			return arr;
		}
		
		List<Integer> rilml(int m) {
			List<Integer> list = new ArrayList<>();
			for(int a : riaml(m))
				list.add(a);
			return list;
		}

		long[] rlaml(int m) {
			long[] arr = new long[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Long.parseLong(str());
			return arr;
		}
		
		List<Long> rllml(int m) {
			List<Long> list = new ArrayList<>();
			for(long a : rlaml(m))
				list.add(a);
			return list;
		}
	}
}

class Node {
	public int val;
	public boolean visited;
	public Node(int v) { val=v; }
}
